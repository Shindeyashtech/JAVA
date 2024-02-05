package Day12th;
// Time of the Day:
// Write a program that takes the current hour (in 24-hour format) as input and prints "Good morning," "Good afternoon," or "Good evening" based on the time.

// good morning 
/**
 * Timeofday
 */
public class Time_Of_Day {

    public static void main(String[] args) {
          
        System.out.println("Enter te hour between in 0-23");
        int A = 23;
System.out.println(A);
        if (A>=0 && A<12) {
            System.out.println("good MORNing");
                         }
        else if (A>=12 && A< 18)
        {
            System.out.println("Good afternoon");
        }
        else if ( A>=18 && A<=23)
        {
            System.out.println("Good evening");

        }
        else{
            System.out.println("You enter a wrong format");
        }

    }
}