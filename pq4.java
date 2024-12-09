import java.util.Scanner;
public class pq4 {
    public static void main(String args[])
    {
        Scanner Marks = new Scanner(System.in);
        System.out.println("Enter Tamil marks");
        int Tamil = Marks.nextInt();
        System.out.println("Enter English marks");
        int English = Marks.nextInt();
        System.out.println("Enter Maths marks");
        int Maths = Marks.nextInt();
        System.out.println("Enter Science marks");
        int Science = Marks.nextInt();
        System.out.println("Enter Social marks");
        int Social = Marks.nextInt();

        int all = Tamil+English+Maths+Science+Social;
        int Avg = all/5;
        System.out.println("Your Average Mark is: "+Avg);

        if(Avg<35){
            System.out.println("Since your average mark is less than 35, You are Listed in Special class");
        }
        else if(Avg>35 && Avg<70){
            System.out.println("Since the mark "+Avg+" dosn't meets our Excellence, you are informed to write the Question paper Answers 2 times");
        }
        else if(Avg>70 && Avg<100){
            System.out.println("Excellent! Keep it up");
        }
        else{
            System.out.println("Provide a Valid marks (from 0-100), Not letters");
        }
    }
}