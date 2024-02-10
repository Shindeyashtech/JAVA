// Encapsulation using  setter and getter by this key word
  class Mobile {
 
    private  String name ;
    private int price ;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
     
    }


 
public class EncapsulationJava {

    public static void main(String[] args) {
        
        Mobile m = new Mobile();
        m.setName("yash");
        m.setPrice(5473);

        System.out.println(m.getName()+":"+m.getPrice());
        

// System.out.println(m.name);

    }
}