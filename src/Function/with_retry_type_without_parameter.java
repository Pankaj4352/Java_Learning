package Function;

import java.util.Scanner;

public class with_retry_type_without_parameter {
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter age");
        int x = sca.nextInt();
        goa(x);
    }
    static void goa(int age)
    {
        String s = username();
        if(age >18 && age <=60)
        {
            System.out.println(s+" Hurry !! You can go to goa");
        }
        else
        {
            System.out.println(s+" You can't go to goa!");
        }
    }
    static String username()
    {
        Scanner sca1 = new Scanner(System.in);
        System.out.println("Enter Full Name");
        String s1 = sca1.nextLine();
        return s1;
    }
}
