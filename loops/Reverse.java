import java.util.Scanner;
class reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number :");
      int n=sc.nextInt();
      int reminder=0;
      int reverse=0;
      for(;n!=0;)
        {
          reminder=n%10;
          System.out.print(reminder);
          n/=10;
        }
    }
  }