package Operators;

public class EX_02_Concatenation {
    public static void main(String []args)
    {
        String first_name = "Rahul";
        String last_name = "Yadav";

        int a=10,b=20;
        // If the start with string variable then it will act as concatenation.
        System.out.println(first_name+last_name+a+b);
        // here variable a and b will get added and then for string variable it will act as concatenation
        System.out.println(a+b+first_name+last_name);
        // Bodmas
        System.out.println(first_name+last_name+(a+b));
        System.out.println(first_name+last_name+(a-b));
        System.out.println(first_name+last_name+(a*b));


    }

}
