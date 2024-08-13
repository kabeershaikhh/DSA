package Recursion;

public class Print {
    public static void printNum(int start,int end){
        if (start>end) {
            System.out.println("Invalid");
            return;
        }
        if (start==end) {
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printNum(start+1,end);
    }
    public static void main(String[] args) {
        printNum(7,12);
    }
}
