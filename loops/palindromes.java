import java.util.Scanner;
class palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number upto which number you want to print the palindromes :");
      int n=sc.nextInt();
      int temp=0;
      int reverse=0;
      int reminder=0;
      for(int i=n;i!=0;i--)
        {
          temp=i;
          while(temp!=0)
            {
              reminder=n%10;
              reverse=reverse*10+reminder;
              temp/=10; 
            }
          if(reverse==i)
          {
            System.out.println(reverse);
          }
        }
    }
  }