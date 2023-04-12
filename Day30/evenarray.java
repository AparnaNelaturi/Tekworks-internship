import java.util.Scanner;
class InvalidException extends Exception
  {
    InvalidException(String message)
    {
      super(message);
    }
  }
class EvenArray
  {
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements :");
      int n=sc.nextInt();
    }
    void testEven()throws InvalidException
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array elements :");
      int a[]=new int[n];
      for(int i=0;i<a.length;i++)
        {
          try{
            if(i%2==0)
              System.out.println(i+"is divisible by 2");
            else
              throw new InvalidException(i+"is not divisible by 2");
          }
        catch(InvalidException e)
            {
              System.out.println(e.getMessage());
            }
        }
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      EvenArray ea[]=new EvenArray[4];
      for(int i=0;i<4;i++)
      {
      ea[i]=new EvenArray();
        try{
      ea[i].add();
      ea[i].testEven();
      }
        catch(InvalidException g)
          {
            System.out.println(g.getMessage());
          }
    }
    }
  }