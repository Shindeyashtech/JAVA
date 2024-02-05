// package day11.java;

public class Main {

    public static void main(String[] args) {
       //This program for checking a large number in the number series
      
        // int a = 10;
        // int b = 20;

        // if (a > b ) 
        //     System.out.println("a is greater");
        
        // else
        // System.out.println("b is greater");
        int a = 200;
        int b = 200;
        int c = 200;
        
        if (a > b && a > c)
            System.out.println("a is greater");
        else if (  b > c)
            System.out.println("b is greater");
        else if (  c > b)
            System.out.println("c is greater");
        else
            System.out.println("All numbers are equal");
        
    
    }
}
