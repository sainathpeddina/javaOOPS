package test1;

class HashMap<K , V> {

    private K key;
    private V value;
    public void setTestData(K key , V value) {
        this.key = key;
        this.value=value;
    }
    @Override
    public String toString() {
        return "Key: "+key + "- Value: " +value;
    }
}
public class genericClassType {

    public static void main(String[] args) {

        HashMap t = new HashMap();
        t.setTestData(1,"One");
        System.out.println(t);

    }
}
