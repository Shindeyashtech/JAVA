package Day16th;



/**
 * Cal
 */
 class Cal {
 
    public int add ( int n1 , int n2)
    {

        int r = n1+n2;
        return r;

    }
    
}

public class Add {

    public static void main(String[] args) {

        int n1=20;
        int n2=30;
        Cal c = new Cal();
         int re= c.add(n1, n2);
        System.out.println(re);

    }
    
}
