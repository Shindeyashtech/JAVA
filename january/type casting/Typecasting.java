/**
 * Typecasting
 */
public class Typecasting {

    public static void main(String[] args) {
        int a=257;
        byte b = (byte)a;
        System.out.println(a);
 
        float c = a;
        System.out.println();

        float f =44.4f;
        int d =  (int) f;
        System.out.println(d);




        // type promotion
         byte s =30;
         byte q= 10;
        // we cant convert byte to int 
         int re = s*q;
         System.out.println(re);
    //   java has feature  that promotes data
    }
}