import java.nio.ByteBuffer;

public class DataRecord {
    private long id;
    private double key;

    public DataRecord(long id, double key) {
        this.id = id;
        this.key = key;
    }

    public long getId() {
        return id;
    }

    public double getKey() {
        return key;
    }

    public static byte[] toByteArray(DataRecord record) {
        ByteBuffer buffer = ByteBuffer.allocate(16);
        buffer.putLong(record.getId());
        buffer.putDouble(record.getKey());
        return buffer.array();
    }

    public static DataRecord fromByteArray(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        return new DataRecord(buffer.getLong(), buffer.getDouble());
    }
}