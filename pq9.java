import java.util.Scanner;
public class pq9 {
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = ip.nextInt();

        System.out.print("Enter the second Number: ");
        int b = ip.nextInt();

        int evencount = 0;
        int oddcount = 0;
        for(int op=a; op<=b; op=op+1)
        {
            if(op%2==0){
                evencount=evencount+1;
            }
            else{
                oddcount=oddcount+1;
            }
        }
        System.out.println("In total there are "+evencount+" Even Numbers and "+oddcount+" Odd Numbers present between "+a+ " and "+b);
    }
}