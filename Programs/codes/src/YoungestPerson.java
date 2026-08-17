//Q4) If the ages of Ram, Shyam and Ajay are given as input, write a program to determine the youngest of the three.

import java.util.Scanner;
public class YoungestPerson {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the age of Ram :-");
        int ram=sc.nextInt();

        System.out.println("Enter the age of Shyam :-");
        int shyam=sc.nextInt();

        System.out.println("Enter the age of Ajay :-");
        int ajay=sc.nextInt();

        age(ram,shyam,ajay);
    }
    private static void age(int ram,int shyam,int ajay)
    {
        if(ram<shyam && ram<ajay)
        {
            System.out.println("Ram is Youngest");
        }
        else if(shyam<ram && shyam<ajay)
        {
            System.out.println("Shyam is Youngest");
        }
        else if (ajay<ram && ajay<shyam)
        {
            System.out.println("Ajay is Youngest");
        }
    }
}
