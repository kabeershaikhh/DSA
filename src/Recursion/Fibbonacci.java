package Recursion;

import java.util.Scanner;

public class Fibbonacci {

    static void printFibonacci(int a,int b,int n) {
    if (n==0) {
        return;
    }
     int c=a+b;
     System.out.print(" "+c);
     printFibonacci(b, c, n-1);
    }

    public static void main(String args[]) {
        int a=0,b=1;
        System.out.print(a+" "+b);
        printFibonacci(a, b, 5);
    }
}
