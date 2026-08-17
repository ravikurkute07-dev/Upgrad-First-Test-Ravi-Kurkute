//Q6) Write a program to display the array elements in reverse order.
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        System.out.println("Array Elements in Reverse Order:");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}