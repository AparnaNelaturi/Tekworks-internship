import java.util.Scanner;
class first
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number :");
      int number=sc.nextInt();
      for(;number>=10;) //for(;n!=0;n/=10)
        {
          number=number/10;
        }
      System.out.println(number);
    }
  }