package TypeCasting;

public class EX_02_TypeCasting_Narrowing {
    public static void main(String []args)
    {
        int a= 100;
      //  byte b = a; // Narrowing --> Implicit casting --> Valid ? No
        byte b2 = (byte)a; // Narrowing --> explicit casting --> valid
    }
}
