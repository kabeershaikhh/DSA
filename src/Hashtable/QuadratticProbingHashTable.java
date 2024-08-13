package Hashtable;

class QuadraticProbingHashTable {
    private int[] keys;
    private String[] values;
    private int capacity;
    
    public QuadraticProbingHashTable(int capacity) {
        this.capacity=capacity;
        this.keys =new int[capacity];
        this.values=new String[capacity];
    }
    
    public void put(int key, String value) {
        int index=hash(key);
        int i=1;
        while (keys[index]!=0 && keys[index]!=key) {
            index=(index + i * i)%capacity;
            i++;
        }
        keys[index]=key;
        values[index]=value;
    }
    
    public String get(int key) {
        int index=hash(key);
        int i=1;
        while (keys[index]!=0) {
            if (keys[index]==key) {
                return values[index];
            }
            index=(index + i * i)%capacity;
            i++;
        }
        return null;
    }
    
    private int hash(int key) {
        return key%capacity;
    }
    public static void main(String[] args) {
        QuadraticProbingHashTable table = new QuadraticProbingHashTable(10);
        table.put(1,"Abeer");
        table.put(2,"Rafay");
        table.put(2,"Abid");
        table.put(2,"Irfan");

        System.out.println(table.get(1));
        System.out.println(table.get(1));
        System.out.println(table.get(1));
        System.out.println(table.get(2));
    }
}

