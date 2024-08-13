package Recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void printNumbers(int start, int end) {
        if (start<=end) {
            System.out.println(start);
            printNumbers(start + 1, end);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scanner.nextInt();
        printNumbers(1, number);
        scanner.close();
    }


}
