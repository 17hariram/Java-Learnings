import java.util.Scanner;
public class pq2 {
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Number to check the divisability of 2 and 5");
        int a = num.nextInt();
        if(a%2 == 0 && a%5 == 0)
        {
            System.out.println("Yes it is divisable by 2 and 5");
        }
        else{
            System.out.print("No, The given number is not divisable by 2 and 5");
        }
    }    
}
