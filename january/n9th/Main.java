

/**
 * InnerMain
 
 */
 class InMain {
    
   private int x;
    private static int y;

    void f1(){
        x=5;
        y=10;
    }
    void f2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);

    }
    void f3 (){
        y=22;
        System.out.println(y);
    }


    
}


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
         
        InMain in = new InMain();
        in.f1(); 
        in.f2();
        in.f3();
        in.f2();
        
        InMain in1 = new InMain();
        // in1.f1();
        in1.f2();
        
        
    }
}