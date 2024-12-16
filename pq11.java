import java.util.Scanner;
public class pq11 {
    public static void main(String args[]){
        Scanner ip = new Scanner (System.in);
        System.out.print("Enter a Number between 1-100 to Check wether the number is divisable by 3 and 5: ");
        int a = ip.nextInt();

        int satisfies = 0;
        for (int op = a; op<=100; op=op+1){
            if(op%3==0 && op%5==0){
                satisfies = satisfies+1;
                System.out.println("The given input is divided in, "+op);
            }
        }
        System.out.println(satisfies+" Times your input gets divided by 3 and 5");
    }
}
