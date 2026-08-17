//Q3) Write a java program to find the summation of digit for given three digit number as given below.


import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :-");
        int num = sc.nextInt();
        int ans = sumOfAllDigit(num);
        System.out.println("Sum Of All Digits :-" + ans);

    }

        private static int sumOfAllDigit(int num)
        {
            int sum=0;
            int rem;

            while(num>0)
            {
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            return sum;
        }
}
