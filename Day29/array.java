import java.util.*;
class WithDrawException extends Exception
  {
    WithDrawException(String message)
    {
      super(message);
    }
  }
class Bank
  {
    String customerName;
    int balance;
    int withdrawamount;
    Scanner s=new Scanner(System.in);
    void readName()
    {
      System.out.println("enter customer name");
      try
        {
          customerName=s.nextLine();
        }
      catch(InputMismatchException i)
        {
          System.out.println("customer name should have only alphabets");
          readName();
        }
    }
      void readBalance()
    {
      System.out.println("enter balance amount");
      try
        {
         balance=s.nextInt();
        }
      catch(InputMismatchException i)
        {
          System.out.println("balance should be in integer format");
          readBalance();
        }
    }
        void readwithDrawAmount()
    {
      System.out.println("enter amount to with draw");
      try
        {
         withdrawamount=s.nextInt();
        }
      catch(InputMismatchException i)
        {
          System.out.println("with draw amount should be in integer format");
          readwithDrawAmount();
        }
          }
      void withdraw()
        {
        
        if((withdrawamount>balance)||(withdrawamount<0))
        {
          try{
          throw new WithDrawException("with draw amount shold be lessthan to balace");
          
        }
        catch(WithDrawException e)
          {
            System.out.println(e);
          }
          }
        else
        {
          balance=balance-withdrawamount;
        }
      }
      void display()
        {
        System.out.println("Customer details");
        System.out.println("customer name "+customerName);
     System.out.println("customer balance "+balance);
        }
  }
class Main
  {
    public static void main(String a[])
    {
      System.out.println("enetr taoatl no of bank customer");
      Scanner s=new Scanner(System.in);
      int numberofcustomers=s.nextInt();
      
      Bank b[]=new Bank[numberofcustomers];
      // array of Bank class Objects  array
      // no object is created
      for(int i=0;i<numberofcustomers;i++)
        {
          b[i]=new Bank();
          // create respetive object
          // creating customer instance
       b[i].readName();
      b[i].readBalance();
       b[i].readwithDrawAmount();
          b[i].withdraw();
          b[i].display();
        }
    }
  }
