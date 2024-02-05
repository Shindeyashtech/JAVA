package feb.three;

/**
 * 
 */
 class Mobile  {

    int price ;
     static String name ;


     public  void show ()
     {
        System.out.println( price +" "+ name    );
     }
    
}


public class StaticMethodJava {
    public static void main(String[] args) {
        
        Mobile m = new Mobile();
        m.price= 400;
        Mobile m1 = new Mobile();
        m1.price= 400;
        Mobile m2 = new Mobile();
        m2.price= 400;

        Mobile.name= "lava";

    //    Mobile.show();
    m.show();
    
    m1.show();
    m2.show();



    }
    
}
