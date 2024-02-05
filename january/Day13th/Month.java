package Day13th;

public class Month {
    public static void main(String[] args) {
        // - Create a Java program that uses a switch statement to determine whether a
        // given month is in
        // step 1 =spring (March, April, May),
        // step 2 =summer (June, July, August),
        // step 3 autumn (September, October, November),
        // step 4 winter (December, January, February).
        int i =0;
   while (i<4) {
    
    Mon m1 = new Mon();  //This is up to object
    m1.fun1();//This is calling function through object
    i++;
}

    }
}

class Mon {

    String months = "May";//This is static user input
    String whether = "";//This is string which is filled with output

    public void fun1() { //This is function which stores a switch statements

        whether = switch (months) {  //This is a switch statement using new methods

            case "March", "April", "May" -> "spring";
            case "June", "July", "August" -> "summer";
            case "September", "October", "November" -> "autumn";
            case "December", "January", "February" -> "winter";
            default -> "Liz entered the month";
        };

        System.out.println(whether);
    }
}
