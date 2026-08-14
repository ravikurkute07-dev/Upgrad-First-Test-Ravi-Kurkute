// Q1) Write a java program to display all Armstrong numbers between 1 to 1000

public class ArmstrongNumber {
    public static void main(String args[])
    {
        for( int i=1; i<=1000;i++ )
            if(i==armstrongNumber(i))
                System.out.println(i +" is Armstrong number .");
    }
public static int armstrongNumber(int number)
{
 int sum=0;
 while(number>0)
 {
     int rem=number%10;
     sum=sum+(rem*rem*rem);
     number=number/10;
 }
 return sum;
}
}
