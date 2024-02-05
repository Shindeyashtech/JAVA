// package 
// how we can access privet static  member variable without creating obj
//make fun static

class Ab {
    
    private static int x;
    // void f1(){
     static void f1(){
        x=5;

        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
     
         Ab.f1();
    }
}