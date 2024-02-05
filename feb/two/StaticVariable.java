/**
 * InnerStaticVariable
 */
class Mobile {

    String brand ;
    int price;
     static String name;
   

    void print(){
        System.out.println( brand +" : "+price +" : "+ name );
    } 
    
}

public class StaticVariable {
    public static void main(String[] args) {
    
        Mobile m1 = new Mobile();
        m1.brand =" samsung";
        m1.price=490000;
        m1.name= "s1";

        Mobile m2 = new Mobile();
        m2.brand =" sung";
        m2.price=90000;
        m2.name= "s2";

        Mobile m3 = new Mobile();
        m3.brand =" sam";
        m3.price=49000;
        m3.name= "s3";

         Mobile.name = " yash";

m1.print();
m2.print();
m3.print();


    }
    
}
