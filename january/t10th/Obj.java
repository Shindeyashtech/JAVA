package t10th;

/**
 * exobj
 * 
 */
class Nokia {
    private int mic, speaker;

    void f1() {
        mic = 5;
        speaker = 20;
    }

    void f2() {
        System.out.println(mic);
        System.out.println(speaker);
    }
}

public class Obj {
    public static void main(String[] args) {

        Nokia n1 = new Nokia();
        n1.f1();
        n1.f2();
    }

}
