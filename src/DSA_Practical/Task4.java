package DSA_Practical;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Total hours employee worked per week:");
            int weekhours=sc.nextInt();

            System.out.print("Employee making money per hour: ");
            int moneyPerHour=sc.nextInt();

            System.out.print("Enter the of vacation days: ");
            int vacationDays=sc.nextInt();

            double weeklySalary= weekhours*moneyPerHour;
            double yearlySalary= (weeklySalary*52 )-(vacationDays*8*moneyPerHour);

            System.out.println("The Total Yearly Salary: "+yearlySalary);
        }
    }
}
