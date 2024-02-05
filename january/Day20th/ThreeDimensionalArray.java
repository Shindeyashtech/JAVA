package Day20th;

public class ThreeDimensionalArray {

    
    public static void main(String[] args) {
        

        int ThreeArray [][] [] = new int [3] [4][5] ;

        for (int i = 0; i < ThreeArray.length; i++) {
            
            for (int j = 0; j < ThreeArray.length; j++) {
                
                for (int j2 = 0; j2 < ThreeArray.length; j2++) {
                     
                 ThreeArray [i][j][j2] = (int)(Math.random()*10);
                }
                System.out.println();
            }
        }

        
        for (int i = 0; i < ThreeArray.length; i++) {
            
            for (int j = 0; j < ThreeArray.length; j++) {
                
                for (int j2 = 0; j2 < ThreeArray.length; j2++) {
                    
                    System.out.print(ThreeArray[i][j][j2]  + " " );
                }
                System.out.println();
            }
        }
        
    }
    
}
