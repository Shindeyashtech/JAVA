package Day13th;

public class NewSwiCase {
      public static void main(String[] args) {

        String ab = "Monday";
        String result = "";
        result = switch (ab) {

            case "Saturday", "Sunday" -> "6am";

            case "Monday" -> "6.30 am";

            default -> "7pm";
        };
        System.out.println(result);

    }

}
// case "Saturday" ,"Sunday" -> System.out.println("6am");
  
// case "Monday" -> System.out.println("7am");

// default -> System.out.println("6.30am");

// method 1

// case "Saturday", "Sunday" -> result ="6am";

// case "Monday" -> result="6.30";

// default -> result="7";

// method 2
 











import java.util.Scanner;

/**
 * Bank
 */
public class Bank {
    
    
    public static void main(String[] args) {
        
        System.out.println(" \nHey ! User Welcome To Our Bank \nWe Hope You Get Best Service  ");
        
        Scanner sc = new Scanner(System.in);
        
        String cNameString;
        int cIdString ;
        
        System.out.println("====================================");
        System.out.println("Enter Your Name : "   );
        // System.out.println();Y
        cNameString = sc.nextLine();
        // cNameString = ("" + cNameString.charAt(0)).toUpperCase() + cNameString.substring(1);
        
        
        while (true) {
            
            
            System.out.println("Enter your 8 Digit Account number");
            // System.out.println();
            if (sc.hasNextInt()) {
                
                cIdString = sc.nextInt();
             
             
             if (cIdString >= 10000000 && cIdString <= 99999999  ) {
                 System.out.println("====================================");
                 BankAccount B1 = new BankAccount(cNameString, cIdString);
                 B1.showMenu();
                }
                else  {
                    System.out.println("Error: Please enter a valid 8-digit account number.");
                    sc.nextLine();
                    continue;
                }
            } else {
                System.out.println("Please enter a account number in numeric format you enter alphabet in your account number");
                sc.next();
                sc.nextLine();
             }   
    
             
}
    
System.out.print("Do you want to restart? (Enter 0 to restart, any other number to exit): ");
int restartOption = sc.nextInt();

if (restartOption == 0) {
    sc.nextLine(); // Consume the newline character left in the buffer
    continue; // Restart the loop
} else {
    break; // Exit the loop if the user does not want to restart
}
}    
   
    }


class BankAccount {

    int balance;
    int previousTransition;
    String customerName ;
    int customerId ;


    BankAccount(String cName , int cID  ){

        customerName = cName;
        customerId  = cID;

    }
    
    public void deposit(int amount) {
        System.out.println(" This is your deposit amount");

        if (amount != 0) { // this condition check your bank balance is zero CCause you can't deposit zero
                           // in your account

            balance += amount; // When your deposit your money then this will be add
            previousTransition = amount; // This condition tells which is your last transaction

        }

    }
    
    public void withdraw(int amount) {
        System.out.println(" This is your withdraw amount");
        if (amount != 0) { // this condition check your bank balance is zero CCause you can't zero in your
                           // account
                           
                           balance -= amount; // When your deposit your money then this will be add
                           previousTransition = - amount; // This condition tells which is your last transaction
                        }
                    }

    public void GetPreviousTransaction() {
        System.out.println(" This is your previous transaction");
        
        if (previousTransition > 0) {

            System.out.println( "Deposited : "+ previousTransition  );
            
        } 
        else if ( - previousTransition < + previousTransition) {
            System.out.println("Withdrawal : " + previousTransition);


            // previousTransition<0
            // System.out.println("Withdrawal : " + Math.abs(previousTransition)  );
            
        }
        else{
            System.out.println("Transaction doesn't occur");
        }
    }
    
    void showMenu(){

        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println(" Hello   : " + customerName);
        System.out.println(" Your 8 digit account number: " + customerId);
        System.out.println();
        
        System.out.println(" A. Check balance" );
        System.out.println(" B. Deposit ");
        System.out.println(" C. Withdraw ");
        System.out.println(" D. Previous Transaction ");
        System.out.println(" E. Exit  ");
        System.out.println();
        System.out.println();
        
        do{
            System.out.println("-------------------------------------------");
            System.out.println(" Enter The Option");
            System.out.println("-------------------------------------------");
            option = sc.next().charAt(0);
            option = Character.toUpperCase(option);




            switch (option) {
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Your balance is :"+ balance);
                    System.out.println("====================================");
                    break;
            
                case 'B':
                    System.out.println("====================================");
                    System.out.println("Enter the deposit amount");
                    System.out.println("====================================");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();

                    break;
            
                case 'C':
                    System.out.println("====================================");
                    System.out.println(" Enter  the withdrawal amount ");
                    System.out.println("====================================");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();

                    break;
            
                case 'D':
                    System.out.println("====================================");
                    GetPreviousTransaction();
                    System.out.println("====================================");
                    break;
            
                case 'E':
                    System.out.println("====================================");
                     
                   break;
            


                default:
                System.out.println("Invalid ! please try again");
                    break;
            }         
               }while( option != 'E' );
    }
    
    
}
// do {
//     System.out.println("-------------------------------------------");
//     System.out.println(" Enter The Option");
//     System.out.println("-------------------------------------------");
//     option = sc.next().charAt(0);
//     option = Character.toUpperCase(option);

//     if (option < 'A' || option > 'E') {
//         System.out.println("Invalid option! Please try again.");
//     }

// } while (option < 'A' || option > 'E');
