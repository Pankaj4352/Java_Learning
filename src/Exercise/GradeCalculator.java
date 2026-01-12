package Exercise;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int score=0;
        System.out.println("Enter Score");
        if(sc.hasNextInt())
        {
            score = sc.nextInt();
        }
        else{
            System.out.println("Enter integer only !!");
            System.exit(0);
        }
        grade(score);
    }
    static void grade(int score)
    {
        System.out.print("Grade for give Score is : ");
        if(score >= 90)
        {
            System.out.println("A");
        }
        else if(score >= 80)
        {
            System.out.println("B");
        }
        else if(score >= 70)
        {
            System.out.println("C");
        }
        else if(score >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}
