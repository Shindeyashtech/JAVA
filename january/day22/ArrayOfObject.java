package day22;



/**
 Students
 */


class Students {

    int rollNum ;
    String name;
    double makrs;


    
}

public class ArrayOfObject {

    public static void main(String[] args) {
        
        Students I1 = new Students();
        I1.makrs=92.25;
        I1.name="Yash";
        I1.rollNum= 1;

        Students I2 = new Students();
        I2.makrs=66.25;
        I2.name="sid";
        I2.rollNum= 2;

        Students I3 = new Students();
        I3.makrs=88.55;
        I3.name="jit";
        I3.rollNum= 3;

System.out.println("RollNum" + "|" + "Name" + "|" + "Marks"  );

Students stud[] = new Students [3];
stud[0] = I1;
stud[1] = I2;
stud[2] = I3;

for (int i = 0; i < stud.length; i++) {
    
    System.out.println( stud[i].rollNum + " : "+ stud[i].name + " : " + stud[i].makrs     );  
            
         }




    }
    
}
