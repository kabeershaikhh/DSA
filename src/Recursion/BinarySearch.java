package Recursion;
import java.util.Scanner;

public class BinarySearch {
    private static int mid = 0;

    public static int binary(int[] arr, int x, int start, int end) {
        if (start <= end) {
            if (arr == null)
                return -1;
            mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                return binary(arr, x, mid + 1, end);
            else
                return binary(arr, x, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int[] arr = { 2, 4, 5, 6, 8, 10 };
        System.out.print("Array elements:");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.print("\nTarget: ");
        int target = sc.nextInt();
        sc.close();
        int index = binary(arr, target, 0, arr.length - 1);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index + ".");
    }
}
