import java.util.Scanner;
class even
  {
    public static void  main(String args[])
    {
      int i=0,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n :");
      n= new sc.nextInt();
      Sytsem.iout.println("The even numbers between 1 to 100 are :");
      while(i<=n && i%2==0)
        {
          System.out.println(i+"is an even number");
          i++;
        }
      System.out.println(i+"is not an even number");
    }
  }