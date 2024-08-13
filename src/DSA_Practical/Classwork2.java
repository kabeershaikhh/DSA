package DSA_Practical;

import java.util.Scanner;

public class Classwork2 {
    Scanner sc=new Scanner(System.in);
    int[] arr;
    int size;
    Classwork2(int size){
        this.size=size;
        arr=new int[size];
    }
    void insert(){
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

    }
    void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
/*void delete(int index){
        for (int i = 0; i < arr.length; i++) {
            if () {
                arr[i]=arr[i+1];
            }
        }
        size--;
        

    }*/

    int linearSearch(int data){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==data) {
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        Classwork2 cl1=new Classwork2(5);
        cl1.insert();
        //cl1.display();
      //  cl1.delete(3);

        System.out.println();
       System.out.println("The Index is: "+cl1.linearSearch(4)); 
         
    }
}