package DSA_Practical;

public class SumArray {

    static int sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
            int arr1[]={11,20,33,15,12,44,34,3,24,46};
        System.out.println("the sum is: "+sum(arr1));

        System.out.println("the maximum value is: "+max(arr1));

        System.out.println("the minimum value is: "+min(arr1));


        
    }
}
