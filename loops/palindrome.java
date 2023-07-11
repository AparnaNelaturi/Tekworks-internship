import java.util.Scanner;
class palindrome
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
          reverse=reverse*10+reminder;
          n/=10;
        }
      System.out.println(reverse);
      if(n==reverse)
      {
        System.out.println(n+" is a palindrome.");
      }
      else
      {
        System.out.println(n+" is not a palindrome");
      }
    }
  }