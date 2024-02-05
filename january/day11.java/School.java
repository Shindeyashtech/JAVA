public class School {
    public static void main(String[] args) {
        // Write a program that takes a student's score as input and prints their grade
        // based on the following criteria:

        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: Below 60

        System.out.println("enter your marks between 100");
        int marks = 60;
        System.out.println(marks);

        // if (marks > 90 && marks < 100)
        if (marks >= 90 && marks <= 100)
            System.out.println("your grade is a");

        // else if (marks > 80 && marks < 89)
        // else if (marks >=80 )
        else if (marks >= 80 && marks <= 89)
            System.out.println("your grade is b");

        // else if (marks > 70 && marks < 79)
        // else if (marks >= 70 )
        else if (marks >= 70 && marks <= 79)
            System.out.println("your grade is c");

        // else if (marks > 60 && marks < 69)
        // else if (marks >= 60 )
        else if (marks >= 60 && marks <= 69)
            System.out.println("your grade is d");

        // else if (  marks < 60 )
        else if (  marks < 60  )
            System.out.println("your grade is f");
        else
            System.out.println("enter correct value");
    }
}
