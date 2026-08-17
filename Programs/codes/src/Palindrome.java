import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        int flag=checkPalindrome(str);

        if(flag==0)
            System.out.println("Sting is Palindrome .");
        else
            System.out.println("String is Not Palindrome .");

    }

    private static int checkPalindrome(String str) {
        int first=0;
        int last=str.length()-1;
        int flag=0;

        while(first<last)
        {
            if(str.charAt(first)!= str.charAt(last))
            {
                flag=1;
                break;
            }
            first++;
            last--;

        }
        return flag;

    }
}