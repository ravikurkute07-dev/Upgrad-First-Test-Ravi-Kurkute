//Q5) Write a program to count frequency of occurrence of 4 in the given array.
import java.util.Scanner;

public class Frequency {
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
        countFrequency(arr);
    }

    private static void countFrequency(int arr[]) {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==4)
            {
                count++;
            }
        }
        System.out.println("Frequency of 4 : " + count);


    }
}