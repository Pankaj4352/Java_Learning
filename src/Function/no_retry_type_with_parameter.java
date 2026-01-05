package Function;

import java.util.Scanner;

public class no_retry_type_with_parameter {
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter number which you want table");
        int a = sca.nextInt();
        table(a);
    }
    static void table(int i)
    {
        for(int x = 1 ; x<=10; x++)
        {
            System.out.printf("%d X %d = %d",i,x,i*x).println();
        }
    }
}
