public class Alg1 {
    private int[] theArray =new int[50];
    private int arraySize=10;
    public void generateArray(){
        for (int i = 0; i < arraySize; i++) {
            theArray[i]=(int)(Math.random()*10)+10;
        }
    }
    public void printarray(){
        for (int i = 0; i < arraySize; i++) {
            System.out.print("|"+i+"|");
            System.out.print(theArray[i]+"|\n");
        }
    }
    public int valueAtIndex(int index){
        if (index<arraySize) {
            return theArray[index];
        }
        return 0;
    }
    public boolean doesThisValueExist(int value){
        boolean valueInArray=false;
        for (int i = 0; i < arraySize; i++) {
            if(theArray[i]==value)
            valueInArray=true;
        }
        return valueInArray;
    }
    public String searchArray(int value){
        for (int i = 0; i < arraySize; i++) {
            if(theArray[i]==value){
                return i+ " ";
            }
            
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        Alg1 alg=new Alg1();
      alg.generateArray();
      alg.printarray();
        System.out.println(alg.valueAtIndex(1));
        //System.out.println(alg.searchArray(12));
        System.out.println(alg.doesThisValueExist(12));
    }
}
