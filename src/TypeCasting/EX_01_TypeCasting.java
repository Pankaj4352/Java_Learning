package TypeCasting;

public class EX_01_TypeCasting {
    public static void main(String []args)
    {
        byte b = 10;
        int a =b; // widening --> Implicit type casting --> automatically done.
        int c = (int)b; // widening --> explicit type casting --> not required.
    }
}
