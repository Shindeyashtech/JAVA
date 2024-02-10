package eight;

public class EncapsulationJava {
    public static void main(String[] args) {
    
        int a [][] [] = new int[4][5][6] ;

        for (int i = 0; i < a[i].length; i++) {
             for (int j = 0; j < a[i][j].length; j++) {
                for (int j2 = 0; j2 < a[i][j].length; j2++) {
                    
                     a[i][j][j2] = (int) (Math.random()*10);
                }
             }

        }
        

        for (int i = 0; i < a[i].length; i++) {
             for (int j = 0; j < a[i][j].length; j++) {
                for (int j2 = 0; j2 < a[i][j].length; j2++) {
                    
                    System.out.println( a[i] + " "+ a[j] + a[j2] );
                    //  a[i][j][j2] = (int) (Math.random()*10);
                }
             }

        }



    }
    
}
