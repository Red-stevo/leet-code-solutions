import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ExternalSort {
    private static final int BLOCK_SIZE = 8192;
    private static final int RECORD_SIZE = 16;
    private static final int RECORDS_PER_BLOCK = BLOCK_SIZE / RECORD_SIZE;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java ExternalSort <filename>");
            return;
        }

        String inputFileName = args[0];
        String runFileName = "runs.dat";

        try {
            createSortedRuns(inputFileName, runFileName);
            mergeSortedRuns(runFileName, inputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createSortedRuns(String inputFileName, String runFileName) throws IOException {
        InputBuffer inputBuffer = new InputBuffer(inputFileName);
        OutputBuffer outputBuffer = new OutputBuffer(runFileName);

        DataRecord[] heap = new DataRecord[RECORDS_PER_BLOCK];
        int heapSize = 0;

        while (true) {
            // Read a block of data into the heap
            DataRecord[] records = inputBuffer.readBlock();
            if (records == null) break; // End of file

            for (DataRecord record : records) {
                if (heapSize < RECORDS_PER_BLOCK) {
                    heap[heapSize++] = record; // Add to the heap
                    Arrays.sort(heap, 0, heapSize, Comparator.comparingDouble(DataRecord::getKey).reversed()); // Maintain max-heap
                } else {

                    outputBuffer.writeRecord(heap[0]);
                    heap[0] = record;

                    Arrays.sort(heap, 0, RECORDS_PER_BLOCK, Comparator.comparingDouble(DataRecord::getKey).reversed());
                }
            }

            // Write remaining records in the heap
            while (heapSize > 0) {
                outputBuffer.writeRecord(heap[0]);
                heap[0] = heap[--heapSize]; // Remove the max
                Arrays.sort(heap, 0, heapSize, Comparator.comparingDouble(DataRecord::getKey).reversed());
            }
        }

        inputBuffer.close();
        outputBuffer.close();
    }

    private static void mergeSortedRuns(String runFileName, String sortedFileName) throws IOException {

        PriorityQueue<DataRecord> minHeap = new PriorityQueue<>(Comparator.comparingDouble(DataRecord::getKey));

        try (InputBuffer runBuffer = new InputBuffer(runFileName);
             OutputBuffer outputBuffer = new OutputBuffer(sortedFileName)) {

            DataRecord[] currentBlock = new DataRecord[RECORDS_PER_BLOCK];
            int blockCount = 0;

            while (true) {
                DataRecord[] records = runBuffer.readBlock();
                if (records == null) break;

                for (DataRecord record : records) {
                    if (record != null) {
                        minHeap.add(record);
                    }
                }


                while (!minHeap.isEmpty()) {
                    outputBuffer.writeRecord(minHeap.poll());
                }
            }
        }
    }
}