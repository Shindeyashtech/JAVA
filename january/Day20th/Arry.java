package Day20th;

public class Arry {

    public static void main(String[] args) {

        int Ary[] = new int[11];

        for (int i = 0; i <= 10; i++) {

            Ary[i] = i + 1;
            // System.out.println();

        }

        Ary[5]=10;
        for (int i = 0; i < 10; i++) {
            System.out.println(Ary[i]);
        }

    }

}
