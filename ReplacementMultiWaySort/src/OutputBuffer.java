import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class OutputBuffer implements AutoCloseable {
    private FileChannel channel;

    public OutputBuffer(String fileName) throws IOException {
        channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
    }

    public void writeRecord(DataRecord record) throws IOException {
        channel.write(ByteBuffer.wrap(DataRecord.toByteArray(record)));
    }

    public void close() throws IOException {
        channel.close();
    }
}