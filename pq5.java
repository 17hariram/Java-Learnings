import java.util.Scanner;
public class pq5 {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        String result = (a%2==0)?"Even":"Odd";
        System.out.println("The Entered Number "+a+" is "+result+" Number.");
    }    
}
