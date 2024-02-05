package Day21;

public class JagedArray {

    public static void main(String[] args) {

        int num[][] [] = new int[3][] [];

        num[0] = new int[3][2];
        num[1] = new int[4] [3];
        num[2] = new int[2][2];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                
                for (int j2 = 0; j2 < num [i] [j].length; j2++) {
                    num[i][j] [j2]= (int) (Math.random() * 10);

                }
            }

        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i]. length; j++) {
                for (int j2 = 0; j2 < num [i][j].length; j2++) {
                    System.out.print(num[i][j][j2] + "  " );
                    
                }
                System.out.println();
            }
        }
    }



}


for
// int num[][] = new int[3][];

// num[0] = new int[3];
// num[1] = new int[4];
// num[2] = new int[2];

// for (int i = 0; i < num.length; i++) {
//     for (int j = 0; j < num[i].length; j++) {
//         num[i][j] = (int) (Math.random() * 10);
//     }

// }

// for (int i = 0; i < num.length; i++) {
//     for (int j = 0; j < num[i]. length; j++) {
//         System.out.print(num[i][j] + "  " );
//     }
//     System.out.println();
// }