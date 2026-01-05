package Function;
import java.util.Scanner;
public class Pratice_1 {
    public static void main(String [] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = 0,b = 0;
        if (s1.hasNextInt()) {

             a = s1.nextInt();
        } else {
            System.out.println("Invalid input ! Please Enter only integer value");
            System.exit(0);
        }
        System.out.println("Enter number1");
        if (s1.hasNextInt()) {

            b = s1.nextInt();
        } else {
            System.out.println("Invalid input ! Please Enter only integer value");
            System.exit(0);
        }
        adding(a,b);
        subtraction(a,b);
        multiply(a,b);
        divide(a,b);
        module(a,b);
    }
    static void adding(int a , int b) {

        System.out.printf("Addition for give two number is %d",a+b).println();
    }
    static void subtraction(int a , int b)
    {
        System.out.printf("Addition for give two number is %d",a-b).println();

    }
    static void multiply(int a , int b)
    {
        System.out.printf("Addition for give two number is %d",a*b).println();

    }
    static void divide(int a, int b)
    {
        System.out.printf("Addition for give two number is %d",a/b).println();

    }
    static void module(int a , int b)
    {
        System.out.printf("Addition for give two number is %d",a%b).println();

    }

}
