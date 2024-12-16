import java.util.Scanner;
public class pq8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = input.nextInt();

        System.out.println("Enter the second Number:");
        int b = input.nextInt();

        for(int output=a; output<=b; output=output+1)
        {
            System.out.println(output);
        }
    }
}
