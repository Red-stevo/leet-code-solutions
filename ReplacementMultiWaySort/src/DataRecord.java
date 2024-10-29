public class DataRecord {

    private long recordId;

    private Double recordKey;


    public DataRecord(long recordId, Double recordKey){
        this.recordId = recordId;
        this.recordKey = recordKey;
    }

    public long getRecordId(){
        return  recordId;
    }

    public Double getRecordKey(){
        return recordKey;
    }

    public void setRecordKey(Double recordKey){
        this.recordKey = recordKey;
    }

    public void  setRecordId(long recordId){
        this.recordId = recordId;
    }

    public String toString(){
        return recordId +","+recordKey;
    }

    public DataRecord toRecordFields(String fileRecord){

        String[] fields = fileRecord.split(",");
        return new DataRecord(Long.parseLong(fields[0]), Double.parseDouble(fields[1]));
    }

}
