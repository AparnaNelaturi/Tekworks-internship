import java.util.Scanner;
class Example
  {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number :");
      int number=sc.nextInt();
      try
        {
          double sqrt=Math.sqrt(number);  
          System.out.println("The square root of a given number is :",n,sqrt);
        }
      catch(Exception e)
        {
          System.out.println("we cannot calculate square root of a negative number ");
        }
    }
  }