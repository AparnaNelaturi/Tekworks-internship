//generate custom exception if the pin is not equals to abc123//
import java.util.Scanner;
class InvalidPinException extends Exception
  {
    InvalidPinException(String message)
    {
      super(message);
    }
  }
class Pin
  {
    String pin;
    Pin(String pin)
    {
      this.pin=pin;
    }
      void verify()throws InvalidPinException 
        {
          if(!pin.equals("abc123"))
          {
            throw new InvalidPinException("your pin is not valid ");
          }
              else
          {
            System.out.println("your pin is valid");
          }
        }
  }
    class Main
      {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your pin :");
      String pin=sc.nextLine();
      Pin p=new Pin("abcd");
      try{
        p.verify();
      }
      catch(InvalidPinException e)
        {
          System.out.println("Invalid pin :"+e.getMessage());
        }
    }
  }
  
  