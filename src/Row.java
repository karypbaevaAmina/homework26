public class Row {
    public String key;
    public String value;


    public Row(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Row() {

    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
