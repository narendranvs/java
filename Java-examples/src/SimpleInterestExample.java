import java.util.Scanner;
public class SimpleInterestExample
{
    public static void main(String args[])
    {
        float p, r, t, sinterest, totalamouninhand;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.println("Simple Interest is: " +sinterest);
        totalamouninhand = p+ sinterest;
        System.out.println("Now you have the amount in hand: "+ totalamouninhand);
    }
}