package Ternary_Operator;

public class T02_Task_find_Max_num_in_Three_Num {
    public static void main(String []args)
    {
        int n1 = 2, n2 = 9, n3 = -11;
        int result = n1>n2 ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3);
        System.out.println(result);
    }
}
