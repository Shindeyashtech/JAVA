package four;
// package four;
// this program is printing 1 to 20 by using diff classes
class Yash1 { // this is another clASS

    
     void fun1() // this same function but in diff class

    {

        int i; 
        for (i = 10; i <= 20; i++) {
            System.out.println(i);
        }

    }
}

public class Yash {
    public static void fun1() {
        int i;
        for (i = 0; i <=9 ; i++) {
            System.out.println(i);
        } // this function in same class

    }

    public static void main(String[] args) {
        fun1();
         Yash1 y1 = new Yash1(); // this is another class object
        y1.fun1();

        // Yash1.fun1();

    } // this main function end here
}