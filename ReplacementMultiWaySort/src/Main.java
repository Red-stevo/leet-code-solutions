import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //write random 8 blocks of  512 records to an input file.
        GenerateFile generateFile = new GenerateFile();
        try {
            generateFile.randomData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}