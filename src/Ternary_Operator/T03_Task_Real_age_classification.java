package Ternary_Operator;

public class T03_Task_Real_age_classification {
    public static void main(String []args)
    {
        int age = 17;
        String result = age>18 ? (age>50 ? "Senior citizen" : "Adult") : "Minor";
        System.out.println(result);
    }
}
