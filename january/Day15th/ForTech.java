package Day15th;

public class ForTech { 
    //Printing day and hour
    public static void main(String[] args) {
    
        for (int i = 1; i <8 ; i++) {

            System.out.println("--- Day---- "+i  +"----------");
            for (int j = 1; j < 9; j++) {
                
                System.out.println( "" + (j+8) + " - " + ( j+9) );
            }
            
        }
        

    }
    
}
