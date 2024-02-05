package Day16th;


public class ArrTwo {
    public static void main(String[] args) {
        
          //2darray

          int a[][] = new int[4][5] ;  // exp1 = 4  row    exp2 = 5 col

          int i,j,k=0;
          for ( i = 0; i < a.length; i++)  // for row 
          for ( j = 0; j < a.length; j++) // col
          {
                a[i][j] = k;
                k++;

          }
          for ( i = 0; i < a.length; i++) {

            for ( j = 0; j< a.length; j++) {
                System.out.print(a[i][j]+" ");
                // System.out.println();
                
            }
          }
    
    }
    
}
