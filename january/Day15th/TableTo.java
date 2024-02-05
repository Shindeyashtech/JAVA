package Day15th;

public class TableTo {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(  " table" + i + " ------" );
            for (int j = 1; j <= 10; j++) { 
             System.out.println((i*j) +  " X " + (i*j ) +" = " + ( (i*j)*(i*j) ));
                
            }
        }
    }
    
}
