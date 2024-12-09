import java.util.Scanner;
public class pq3 {
    public static void main(String[] args)
    {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the Marks Obtained:");
        int a = marks.nextInt();
        if(a<30){
            System.out.println("Nice try!");
        }
        else if(a>30 && a<60){
            System.out.println("Good Score!");
        }
        else if(a>60 && a<90){
            System.out.println("Excellent Score!");
        }
        else if(a>90 && a<100){
            System.out.println("Awesome Score!");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
