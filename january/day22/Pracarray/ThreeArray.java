package day22.Pracarray;

public class ThreeArray {

    public static void main(String[] args) {
        
        int a[][][]= new int [3][][];

        a[0] = new int[3][4];
        a[1] = new int[4][2];
        a[2] = new int[3][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int j2 = 0; j2 < a[i][j].length; j2++) {
                    
                      a [i][j][j2] = (int) (Math.random()*10);
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int j2 = 0; j2 < a[i][j].length; j2++) {
                    System.out.print(a[i] [j] [j2] + " " );
                }
                System.out.println();
            }
        }
    }
    
}
