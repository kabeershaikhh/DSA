package Recursion;

public class Sum {
    private static void recSum(int i,int n,int sum){
        if (i==n) {
            sum+=i;
            System.out.println("Sum = "+sum);
            return;
        }
        sum+=i;
        recSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        recSum(1, 4, 0);
    }
}
