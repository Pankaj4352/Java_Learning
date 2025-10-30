package TypeCasting;

public class EX_03_TypeCasting {
    public static void main(String []args)
    {
        long l = 9874766943l;
     //   short s1 = l; // Narrowing implicit casting not possible.
        short s2 = (short)l; // Narrowing explicit casting possible.
        System.out.println(s2);
    }
}
