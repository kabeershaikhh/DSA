
public class MaxMin {
    public static void max(int[] arr){
        int max=0;
        arr[0]=max;
        for (int i=1;i< arr.length;i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("max number is: "+ max);
    }
    public static void min(int[] arr){
        int min=Integer.MAX_VALUE;
        arr[0]=min;
        for (int i=1;i< arr.length;i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("min number is: "+ min);
    }


    public static void main(String[] args) {
     int[]   arr={31 , -2 , 73 , 215 , 243 , 14 , 5 , 23 , 2 , 156};
      MaxMin.max(arr);
      MaxMin.min(arr);
    }
}
