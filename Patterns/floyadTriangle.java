import java.util.Scanner;
class Floyad
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,temp=1;
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
            {
              System.out.println(temp);
              temp++;
            }
          System.out.println();
        }
    }
  }