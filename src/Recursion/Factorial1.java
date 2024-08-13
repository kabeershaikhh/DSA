package Recursion;

import java.util.Scanner;

public class Factorial1 {
    public static int factorial(int x){

        int ans=1;
        for (int i = x; i > 0; i--) {
            ans*=i;
        }
        return ans;
    }
    public static int recFac(int x){
        if (x<0) {
            System.out.println("invalid value!!");
            return -1;
        }
        else if (x>=0 && x<=1) {
            return 1;
        }
        return x*factorial(x-1);
    }

    public static int reFibonacci(int n){
        if (n==0) {
            return n;
        }
        if (n==1) {
            return n;
        }
        else{
          return  reFibonacci(n-1)+reFibonacci(n-2);
        }
    }
    static void hanoi(int n,char x,char y,char z){
        if (n==1) {
            System.out.println(x+"-->"+z);
        }
        else{
            hanoi(n-1, x, z, y);
            System.out.println(x+"-->"+z);
            hanoi(n-1, y, x, z);
        }

    }
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
       System.out.println("Answer: "+Factorial1.factorial(3)); 
       System.out.println("Answer: "+Factorial1.recFac(-1)); 
       int term = 7;
       System.out.println("Fibonacci series up to term " + term + ":");
       for (int i = 0; i < term; i++) {
           System.out.print(reFibonacci(i) + " ");
       }

       Factorial1.hanoi(3, 'a','b','c');
       sc.close();
    }
}

