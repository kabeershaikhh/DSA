package Sort;

import java.util.Arrays;

public class Sort {
    static int arr[];
    

    
    static void bubbleSort(int arr[]){
        int temp;
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < (arr.length-1)-i; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void selectionSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
          
            int temp=arr[i];
            int j=i-1;
          
            while (j>=0 && arr[j]> temp) {
            arr[j+1]=arr[j];
            j--;
           }
           arr[j+1]=temp;
        }
    }
    static void quickSort(int[] arr, int start ,int end){
        if (end<= start) {
            return;
        }    
        int pivot =partition(arr, start, end);
        quickSort(arr, start, pivot -1);
        quickSort(arr, pivot+1, end);
    }
    static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if (arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return i;
    }

    public static void main(String[] args) {

        int[] arr1={180,165,150,170,145};
        System.out.println("Before Sorting: "+Arrays.toString(arr1));
        bubbleSort(arr1);
         System.out.println("Sorted Array by Selection Sort: "+Arrays.toString(arr1));
   
        int[] arr2={180,165,150,170,145};
        System.out.println("Before Sorting: "+Arrays.toString(arr2));
        selectionSort(arr2);
        System.out.println("Sorted Array by Selection Sort: "+Arrays.toString(arr2));
        
        int[] arr3={180,165,150,170,145};
        System.out.println("Before Sorting: "+Arrays.toString(arr3));
        insertionSort(arr3);
        System.out.println("Sorted Array by Insertion Sort: "+Arrays.toString(arr3));
       
       int[] arr4={180,165,150,170,145};
        System.out.println("Before Sorting: "+Arrays.toString(arr4));
       quickSort(arr4, 0, arr4.length-1);
        System.out.println("Sorted Array by Quick Sort: "+Arrays.toString(arr4));

        long startTime=System.nanoTime();
        bubbleSort(arr1.clone()); 
        long endTime=System.nanoTime();
        System.out.println("Time took by bubble sort: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        selectionSort(arr2.clone());
        endTime = System.nanoTime();
        System.out.println("Time took by selection sort: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        insertionSort(arr3.clone());
        endTime = System.nanoTime();
        System.out.println("Time took by insertion sort: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        quickSort(arr4.clone(), 0, arr4.length - 1);
        endTime = System.nanoTime();
        System.out.println("Time took by quick sort: " + (endTime - startTime) + " nanoseconds");
    }

    }
    

