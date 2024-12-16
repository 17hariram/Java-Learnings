import java.util.Scanner;
public class pq6 {
    public static void main(String args[]){

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = numbers.nextInt();
        
        System.out.println("Enter the second number:");
        int b = numbers.nextInt();
        String result = a>b?a+" is Greater":+b+" is greater";
        System.out.println(result);  
    }
}
