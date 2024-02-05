package fifth;

class Main3 {
    void result() {

        int a, b, add, subtraction, multi, division; // instance member var
        a = 10;
        b = 20;
        add = a + b;
        subtraction = a - b;
        multi = a * b;
        division = a / b;
        String all = "a " + a + "b " + b + "add " + add + "subtraction " + subtraction + "multi " + multi + " division "
                + division;
        System.out.println(all);

    }

}

class Main2 {
    void a1() { // this fun is call as non static or instance member fun or object member
                // variable

        System.out.print("yash");

    }

    static void a2() {
        System.out.print("kishor");
    }
}

public class Main {
    static void a1() {
        System.out.println("yash kishor shinde");
    }

    public static void main(String[] args) {
        System.out.println("shinde");

        // class name ref veriable = new keyword class name ();
        Main2 m1 = new Main2();// creating object of main2 class for accessing its properties
        m1.a1(); // cAlling outside function using ref var of object
        Main2.a2(); // this is also called function calling but the fun is static
        a1(); // this is also fun call but fun inside the main fun

        Main3 m3 = new Main3();
        m3.result();

    }

}
