import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class InputBuffer implements AutoCloseable {
    private FileChannel channel;
    private ByteBuffer byteBuffer;
    private final int blockSize = 8192;

    public InputBuffer(String fileName) throws IOException {
        channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ);
        byteBuffer = ByteBuffer.allocate(blockSize);
    }

    public DataRecord[] readBlock() throws IOException {
        byteBuffer.clear();
        int bytesRead = channel.read(byteBuffer);
        if (bytesRead == -1) return null;

        byteBuffer.flip();
        DataRecord[] records = new DataRecord[512];
        for (int i = 0; i < 512; i++) {
            byte[] recordBytes = new byte[16];
            byteBuffer.get(recordBytes);
            records[i] = DataRecord.fromByteArray(recordBytes);
        }
        return records;
    }

    public void close() throws IOException {
        channel.close();
    }
}