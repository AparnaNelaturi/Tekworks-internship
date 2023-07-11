/*import java.util.Scanner;
class Pattern
  {
    public static void main(String args[])
    {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number :");
      int n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=n;j++)
            {
              if(i==j || i+j==6)
                System.out.println("$");
              else
              System.out.println("*");
            }
        }
    }
  }*/
import java.util.Scanner;
class Pattern
  {
    public static void main(String args[])
    {
      int i,j;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(i=0;i<n;i++)
        {
          for(j=0;j<=i;j++)
            {
              if(i+j>=6)
              System.out.println(" ");
              else
                System.out.println("*");
            }
        }
    }
  }
