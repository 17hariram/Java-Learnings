import java.util.Scanner;
public class pq1{
    public static void main(String args[])
    {
        System.out.println("Enter the Amount to verify:");
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        if (a>7000){
            System.out.println("You are not eligible for the Scholarship");
        }
        else {
            System.out.println("You are eligible for the scholarship");
        }
    }
}