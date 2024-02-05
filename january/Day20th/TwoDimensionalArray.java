package Day20th;

/**
 * TwoDimensionalArray
 */
public class TwoDimensionalArray {

    public static void main(String[] args) 
    {
        int[][] ArrayOfTwo = new int[3][4];  // this is array

        
        for (int i = 0; i < ArrayOfTwo.length; i++) 
        {
            for (int j = 0; j < ArrayOfTwo.length; j++) 
            {
                ArrayOfTwo[i][j] = (int) (Math.random() * 10);
            }
        }
        //above code  for random value generator
        

        // this code for printing row and col
        for (int i = 0; i < ArrayOfTwo.length; i++) 
        {
            for (int j = 0; j < ArrayOfTwo.length; j++) 
            {
                System.out.print(ArrayOfTwo[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("---------   his is enhANCED FOR LOOP  ");


        for(int n[]: ArrayOfTwo ){
           for(int m:n){

               System.out.print(m + " ");
           }
           System.out.println();
        }

    }
}