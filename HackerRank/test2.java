import java.util.Scanner;
class InvalidException extends Exception
  {
    InvalidException(String message)
    {
      super(message);
    }
  }
class test
  {
    public static void main(String args[])
    {
      try{
        int a[]={1,2,3,4,5};
        for(int i=0;i<7;++i)
          System.out.println(a[i]);
      }
      catch(InvalidException e)
        {
          System.out.println(e.getMessage());
        }
    }
  }