package DSA_Practical;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Who hosted the ICC Men's Cricket World Cup? \n1. England\n2. Pakistan\n3. India\n");
            int input= sc.nextInt();

            if (input==1) {
                System.out.println("The Answer is Correct!");
            }
            else{
                System.out.println("Inncorrect Answer!");
            }
        }
    }
}
