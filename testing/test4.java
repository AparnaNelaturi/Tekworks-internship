import java.util.Scanner;
class prime
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      int n=sc.nextInt();
      for(int i=2;i<n;i++)
        {
          int count=0;
          for(int j=1;j<n;j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.println(i);
          }
        }
    }
  }