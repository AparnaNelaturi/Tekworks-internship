import java.util.Scanner;
class maxNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the numbers :");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>=b && a>=c)
      {
        System.out.println(a);
      }
      else if(b>=a && b>=c)
      {
        System.out.println(b);
      }
      else if(c>=a && c>=b)
      {
        System.out.println(c);
      }
    }
  }
  