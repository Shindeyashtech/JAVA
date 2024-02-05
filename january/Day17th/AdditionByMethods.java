package Day17th;

/**
 * erAdditionByMethods
 */
 class InnerAdditionByMethods {

    public int Add (int a,int b)
    {

        return a+b;
    }

    public int Add (int a,int b,int c)
{
    return a+b+c;
}
}

public class AdditionByMethods { 
    public static void main(String[] args) {
        

        InnerAdditionByMethods A = new InnerAdditionByMethods();
      int  AdditionOfTwoNumbers=    A.Add(10,20);
      int AdditionOfThreeNumbers=  A.Add(10, 20,30);

System.out.println(AdditionOfThreeNumbers);
System.out.println(AdditionOfTwoNumbers);
    }
}
