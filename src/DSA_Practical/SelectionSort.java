package DSA_Practical;

import java.util.Arrays;

public class SelectionSort {
    static int arr[];
    static void selectionSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex=j;
                }
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,11,21,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
