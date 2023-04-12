import java.util.Scanner;
class Calculator
  {
    double a;
    double b;
    Calculator(double a,double b)
    {
      this.a=a;
      this.b=b;
    }
    double addition(double a,double b)
    {
      return a+b;
    }
    double subtraction(double a,double b)
    {
      return a-b;
    }
    double division(double a,double b)
    {
      return a/b;
    }
    double multiplication(double a,double b)
    {
      return a*b;
    }
    double modulo(double a,double b)
    {
      return a%b;
    }
  }
class InvalidExpressionException extends Exception
  {
    InvalidExpressionException(String message)
    {
      super(message);
    }
  }
class Main
      {
        public static void main(String args[])
        {
          try
            {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the value of a :");
              double a=sc.nextDouble();
              System.out.println("Enter the value of b :");
              double b=sc.nextDouble();
              Calculator c=new Calculator(3,4);
              System.out.println(c.addition(a,b));
              System.out.println(c.subtraction(a,b));
              System.out.println(c.division(a,b));
              System.out.println(c.multiplication(a,b));
              System.out.println(c.modulo(a,b));
            }
          catch(Exception e)
        {
          System.out.println("Invalid Expresions :"+e.getMessage());
        } 
        }
      }