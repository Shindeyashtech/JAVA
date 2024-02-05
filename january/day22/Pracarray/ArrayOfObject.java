package day22.Pracarray;

/**
 * Student
 */
class Student {

    int rollNum;
    String name;
    double marks;

}

upublic class ArrayOfObject {

    public static void main(String[] args) {

        Student i1 = new Student();
        i1.rollNum = 1;
        i1.name = "yash";
        i1.marks = 66.20;

        Student i2 = new Student();
        i2.rollNum = 2;
        i2.name = "jit";
        i2.marks = 88.53;

        Student i3 = new Student();
        i3.rollNum = 3;
        i3.name = "sid";
        i3.marks = 99.55;

        Student students[] = new Student[3];
        students[0] = i1;
        students[1] = i2;
        students[2] = i3;

        // System.out.println(students[0]);

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i].rollNum + " " + students[i].name + " " + students[i].marks);
        }

    }

}
