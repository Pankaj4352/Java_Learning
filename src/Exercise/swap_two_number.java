package Exercise;

public class swap_two_number {
    public static void main(String [] args)
    {
        int a=10, b=20;
        a=a+b; // a=10+20 i.e a=30 now.
        b= a-b; // b = 30-20 i.e b = 10 now.
        a= a-b;// a = 30-10 i.e a = 20 now.
        System.out.printf("Value as a is now %d and value of b is now %d",a,b);
    }
}
