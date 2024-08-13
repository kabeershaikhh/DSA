package DSA_Practical;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,999};
        System.out.println(getMax(array));
        System.out.println(getMin(array));
        System.out.println("the sum: "+Sum(array));

    }


    static int getMax(int []array ){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
            
        }
  return max;
    }

    static int getMin(int []array ){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
            
        }
  return min;
    }
    static int Sum(int[]array){
      int sum=0;
      for (int i = 0; i < array.length; i++) {
        sum+=array[i];

      }
      return sum;
    }
}