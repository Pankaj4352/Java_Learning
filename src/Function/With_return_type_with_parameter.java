package Function;
import java.util.Scanner;
public class With_return_type_with_parameter {
    public static void main(String[] arge)
    {
        Scanner sca = new Scanner(System.in);
        int a = readInt(sca , "Enter number 1");
        int b = readInt(sca , "Enter number 2");

        int result_sum = add(a,b);
        int result_sub = subtract(a,b);
        int result_mul = multiply(a,b);
        int result_div = divide(a,b);
        System.out.println("Sum of two number = "+ result_sum);
        System.out.println("subtraction of two number = "+ result_sub);
        System.out.println("multiplication of two number = "+ result_mul);
        System.out.println("Division of two number = "+ result_div);
    }
    static int readInt(Scanner sc , String s)
    {
        System.out.println(s);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else{
            System.out.println("Enter integer only !!");
            System.exit(0);
            return 0;
        }
    }

    static int add(int a , int b)
    {
        return a+b;
    }
    static int subtract(int a , int b)
    {
        return a-b;
    }
    static int multiply(int a , int b)
    {
        return a*b;
    }
    static int divide(int a , int b)
    {
        return a/b;
    }
}
