package Day13th;

public class SwiCase {

    public static void main(String[] args) {
     //its a program that if enter number between 0 to 7 tis prints  a day   of week  using switch case  
        int a= 5;
        
      switch (a) {
         
        case 1 :
        System.out.println("MONDAY");   
        break;
        case 2 :
        System.out.println("TUESDAY"); 
        break;
        case 3 :
        System.out.println("Wednesday"); 
        break;
        case 4 :
        System.out.println("THURSDAY"); 
        break;
        case 5 :
        System.out.println("FRIDAY"); 
        break;
        case 6 :
        System.out.println("SATURDAY"); 
        break;
        case 7 :
        System.out.println("SUNDAY"); 
        break;
        default :
        System.out.println("enter numbetween  1 to 7"); 
        break;
      } 
    }
    
}
