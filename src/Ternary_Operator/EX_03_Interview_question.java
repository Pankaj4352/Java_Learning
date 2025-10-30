package Ternary_Operator;

public class EX_03_Interview_question {
    public static void main(String []args)
    {
        int age =29;
        String result = age > 18 ? (age > 25 ? "You can go to goa and you can drink" : "You can go to goa but you can't drink") : "You can't go to goa" ;
        System.out.println(result);
    }
}
