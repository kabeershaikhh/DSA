package Hashtable;
class LinearProbingHashTable {
    private int[] keys;
    private String[] values;
    private int capacity;
    
    public LinearProbingHashTable(int capacity) {
        this.capacity=capacity;
        this.keys=new int[capacity];
        this.values=new String[capacity];
    }
    
    public void put(int key, String value) {
        int index = hash(key);
        while (keys[index]!=0 && keys[index]!=key) {
            index=(index+1) % capacity;
        }
        keys[index]=key;
        values[index]=value;
    }
    
    public String get(int key) {
        int index=hash(key);
        while (keys[index]!=0) {
            if (keys[index]==key) {
                return values[index];
            }
            index=(index + 1) % capacity;
        }
        return null;
    }
    
    private int hash(int key) {
        return key % capacity;
    }
    public static void main(String[] args) {
        LinearProbingHashTable table = new LinearProbingHashTable(10);
        table.put(1,"Kabeer");
        table.put(1,"Rafay");
        table.put(1,"Abid");
        table.put(2,"Irfan");

        System.out.println(table.get(1));
        System.out.println(table.get(2));
        System.out.println(table.get(1));
        System.out.println(table.get(1));
    }
}

