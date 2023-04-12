//generate an exception when ATM pin is not exactly 4 digits  
import java.util.*;
class Atmpinwrong extends Exception
{
    Atmpinwrong(String message)
    {
    super(message);
    }
}
 
class ATMPin
{
    String pin;
    ATMPin(String pin)
    {
        this.pin=pin;
    }
    void verify() throws Atmpinwrong
    {
        try
        {
            if(pin.length()!=4)
                throw new Atmpinwrong("invalid number of charcaters");
          else
            {
              System.out.println("valid atm pin");
            }
        }
      catch(Atmpinwrong a)
          {
            System.out.println(a.getMessage());
          }
    }
      public static void main(String args[])
        {
        Scanner S=new Scanner(System.in);
        System.out.println("enter atm pin");
        String pin=S.next();
        ATMPin ap=new ATMPin(pin);
        try{
        ap.verify();
        }
        catch(Atmpinwrong n)
        {
            System.out.println(n.getMessage());
        }
      }
}
    
      