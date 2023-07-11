//factorial n=5;5*4*3*2*1
import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number :");
      int n=sc.nextInt();
      int fact=1;
      while(n>=1)
        {
          System.out.print(n+"*");
          fact=fact*n;
          n--;
        }
      System.out.println("factorial is"+fact);
    }
  }