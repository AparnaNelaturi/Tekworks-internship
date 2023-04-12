import java.util.*;
class InvalidWith_drawException extends Exception
  {
    public InvalidWith_drawException(String message)
    {
      super(message);
    }
  }

class WithdrawAmount{
  public static void main(String args[]) throws InvalidWith_drawException
  {
    Scanner sc=new Scanner(System.in);
    String withdrawamount=sc.nextLine();
    try{
      
      double withdrawAmount=Double.parseDouble(withdrawamount);
      System.out.println("withdraw amount is a number");
    }
    catch(Exception e)
      {
      throw new InvalidWith_drawException("withdraw amount not a number");
    }
  }
}
