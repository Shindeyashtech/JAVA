package Day17th;

public class Cal {
    
    public static void main(String[] args) {

        Mobile M1 = new Mobile();
        M1.PlayMusic();
       String paymentString=  M1.Payment(5);
         
       System.out.println(paymentString);

    }
    
}
/**
 * InnerCal
 */
 class Mobile {


    // private static final String Success = null;

    public void PlayMusic (){

        System.out.println("Music is playing");
    } 
    
    
    public String Payment( int cost)
    {
    if (cost >=5) {
        
    return "Success" ;
    }else{
    return "SuccessFailed" ;
    }
    
    }    
 }
    
        // public String Payment(int cost ) {
            
        //     if (cost>=10) {
                
        //         return "yes";
        //     } else{
        //         return "no";
        //     }
    
        // }
        // public String Payment(int cost , int c ){
        //  if (cost<10) {
            
        //      return "no";
        //  }
        //  else{
        //     System.out.println("sss");
        //     return "ss";
        //  }
    
        // }