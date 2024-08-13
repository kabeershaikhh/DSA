package Stack;

public interface Stack {

    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int size();
} 
 class ArrayStack implements Stack {
    private Object[] a;
    private int size;

    public ArrayStack(int capacity){
        a =new Object[capacity];
    }
    boolean isEmpty(){
        return (size==0);
    }
    public Object peek(){
        if (size==0) {
            throw new IllegalStateException("Stack is empty");
          
        }
          return a[size-1];
    }
    public Object pop(){
        if (size==0) {
            throw new IllegalStateException("Stack is empty");
          
        }
        Object temp=a[--size];
        a[size]=null;
        return temp;
    }
    public void push(Object obj){
        if (size==a.length) {
        //resize();
        }
        a[size++]=obj;
    }
    public int size(){
        return size;
    }
    public void substack(ArrayStack as){
        
    }
public static void main(String[] args) {
     ArrayStack fruitcrate =new ArrayStack(10);
    fruitcrate.push("apples");
    fruitcrate.push("oranges");
    fruitcrate.push("corn");
    fruitcrate.push("grapefruit");
    fruitcrate.push("mangos");
    fruitcrate.push("pomegranate");  
    
         ArrayStack coldDrinkCrate =new ArrayStack(10);
        coldDrinkCrate.push("pepsi");
        coldDrinkCrate.push("slice");
        coldDrinkCrate.push("cola next");
        coldDrinkCrate.push("nestle");
        coldDrinkCrate.push("gourment");

        System.out.println(fruitcrate.size());
        System.out.println(coldDrinkCrate.size());
        System.out.println(coldDrinkCrate.peek());
  }

}
