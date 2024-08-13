package DSA_Practical;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Age: ");
            int age=sc.nextInt();

            if (age>13 && age<65) {
                System.out.println("The price of ticket is: $10");
            }
            else if (age<=13) {
                System.out.println("The price of ticket is: $5");
            }
            else if (age>=65) {
                System.out.println("The price of ticket is: $7");
            }
        }
    }
}
