import java.io.*;
import java.util.Random;

public class GenerateFile {

    /*Method to write random values to a file.*/
    public void randomData() throws IOException {
        Random random = new Random(100);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("./inputFile")));
        int k = 0;

        while(k < 8) {
            for (int i = 0; i < 512; i++) {
                DataRecord record = new DataRecord(
                        random.nextLong(1, 10000), random.nextDouble(1,10000));
                writer.write(record.toString());
                writer.newLine();
                writer.flush();
            }
            k++;
        }
    }
}
