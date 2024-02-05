package Day13th;

public class Shap {
    // - Write a Java program that uses a switch statement with a String expression
    // to determine the type of a geometric shape (circle, square, triangle, etc.).

    public static void main(String[] args) {

        String shape_Name = "circle";

        String shape = "";

        shape = switch (shape_Name) {

            case "circle" -> "its circle";
            case "square" -> "its square";
            case "triangle" -> "its triangle";
            default -> "please enter =circle, square, triangle";

        };
        System.out.println(shape);
    }

}
