package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        if (n < 0){
            System.out.print("Invalid Value: ");
            return n;
        }
           else {
           return n * factorial(n - 1);}
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        System.out.println( factorial(num));
        sc.close(); 
    }
}
