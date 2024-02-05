package oprator;
//Arithmetic operator
public class Cal {
    public static void main(String[] args) {
        
        int n1 =1;
        int result = n1++; 
        // post increment
        int result1 = ++n1; //pre
        int result2 = --n1;   
        // post decrement\
        int result3 = n1--;//pre

        System.out.println( "a"+result+ "B"+ result1 + "c"+ result2 + "d" +result3);
    }
    
}
