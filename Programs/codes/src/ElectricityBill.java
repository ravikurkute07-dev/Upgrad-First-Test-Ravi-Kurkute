import java.util.Scanner;
public class ElectricBill {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Electricity Consumption Units ");
        double meterunits=sc.nextDouble();

        double rate ;
        double bill;
        if(meterunits < 0)
        {
            System.out.println("Invalid Units");
        }
        else
        {
            if(meterunits <= 100)
                rate = 3.5;
            else if (meterunits <= 200)
                rate = 6.5;
            else if (meterunits <= 300)
                rate = 7.5;
            else 
                rate = 8.5;

            bill = (meterunits * rate) + 100;

            System.out.println("Total Electricity Bill Is :- Rs. "+bill);
        }
    }
}
