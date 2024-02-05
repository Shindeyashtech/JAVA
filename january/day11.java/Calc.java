public class Calc {
    public static void main(String[] args) {
       
        System.out.println("Please enter a number one number two Operation that you want to perform in this format '+','-' ,'*','/' ");
        int num1 = 54;
        int num2 =95;
        char op = '+';
System.out.println("TThis is number one= "+num1);
System.out.println("This is number two= "+num2);
System.out.println("This is operator= "+op);
            if(op=='+'  )
            System.out.println(num1+num2);        
            else if( op == '-')
            System.out.println(num1-num2);
            // System.out.println();
            else if (op=='*')
            System.out.println(num1*num2);
            else if (op=='/')
            System.out.println(num1/num2);
            else
            System.out.println("please enter right format");

    }
    
}
