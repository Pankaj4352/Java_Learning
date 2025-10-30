package Ternary_Operator;

public class EX_04_Find_Max_num_in_two_num {
    public static void main(String []args)
    {
        int a = 30 , b = 20;
        int result = b>a ? b : a;
        System.out.println(result);
        System.out.println(Math.max(b,a));

    }
}
