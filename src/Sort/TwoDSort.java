package Sort;

import java.util.Arrays;

public class TwoDSort {

    static int[][] arr2D;

    static void bubbleSort2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    static void selectionSort2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                int minIndex = j;
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][k] < arr[i][minIndex]) {
                        minIndex = k;
                    }
                }
                int temp = arr[i][j];
                arr[i][j] = arr[i][minIndex];
                arr[i][minIndex] = temp;
            }
        }
    }

    static void insertionSort2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                int key = arr[i][j];
                int k = j - 1;
                while (k >= 0 && arr[i][k] > key) {
                    arr[i][k + 1] = arr[i][k];
                    k--;
                }
                arr[i][k + 1] = key;
            }
        }
    }

    static void quickSort2D(int[][] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort2D(arr, start, pivotIndex - 1);
            quickSort2D(arr, pivotIndex + 1, end);
        }
    }

    static int partition(int[][] arr, int start, int end) {
        int[] pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (compare(arr[j], pivot) <= 0) {
                i++;
                swapRows(arr, i, j);
            }
        }
        swapRows(arr, i + 1, end);
        return i + 1;
    }

    static int compare(int[] a, int[] b) {
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if (a[i] != b[i]) {
                return Integer.compare(a[i], b[i]);
            }
        }
        return Integer.compare(a.length, b.length);
    }

    static void swapRows(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray2D(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        arr2D = new int[][]{
            {2, 10, 15},
            {5, 1, 3},
            {6, 9, 4}
        };

        System.out.println("Original 2D Array:");
        printArray2D(arr2D.clone());
        System.out.println();

        System.out.println("Sorting using Bubble Sort:");
        bubbleSort2D(arr2D.clone());
        printArray2D(arr2D);
        System.out.println();

        System.out.println("Sorting using Selection Sort:");
        selectionSort2D(arr2D.clone());
        printArray2D(arr2D);
        System.out.println();

        System.out.println("Sorting using Insertion Sort:");
        insertionSort2D(arr2D.clone());
        printArray2D(arr2D);
        System.out.println();

        System.out.println("Sorting using Quick Sort:");
        quickSort2D(arr2D.clone(), 0, arr2D.length - 1);
        printArray2D(arr2D);
    }
}
