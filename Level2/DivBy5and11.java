import java.util.Scanner;
class Division
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      int n=sc.nextInt();
      if(n%5==0 && n%11==0)
      {
        System.out.println(n+" is divisible by 5 and 11");
      }
      else
      {
        System.out.println(n+" not divisible by 5 and 11");
      }
    }
  }