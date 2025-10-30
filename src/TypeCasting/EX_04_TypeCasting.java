package TypeCasting;

public class EX_04_TypeCasting {
    public static void main(String []args)
    {
        int salary = 100;
        float gst = 18.45f;
        //int total = salary+gst; //Narrowing implicit casting not possible.
        int total1 = salary+(int)gst;//Narrowing explicit casting not possible.
        System.out.println(total1);

        float total2 = salary+gst; // widening implicit casting possible.
        System.out.println(total2);
        float total3 = (float)salary+gst; // widening explicit casting possible but not required
        System.out.println(total3);


    }

}
