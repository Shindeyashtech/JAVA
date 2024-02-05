package feb.three;

class Mobile {

    // int price;
    static String name;

    // public Mobile() {
    //     price = 200;
    //     System.out.println("constructor");
    // }

    static {
        name = "raaj";
        System.out.println("static");
    }

    
}

public class StaticMethodJava {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("feb.three.Mobile");

        // Creating an instance of Mobile and calling the show method
        // Mobile mobileInstance = new Mobile();
        // mobileInstance.show();
    }
}
