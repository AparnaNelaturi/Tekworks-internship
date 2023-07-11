import java.util.Scanner;
public class PrintNumber 
{
  public static void displaysum(int n,int m,int s)
   {
    while(n<=m)
      {
        if(m%2==0 && m%3==0)
        {
          if(s==m)
          {
            break;
          }
          else{
            System.out.println(m);
          }
        }
        m--;
      }
  }
  }
  public static void main(String[] a)
  {
    Scanner d=new Scanner(System.in);
    int n=d.nextInt();
    int m=d.nextInt();
    int s=d.nextInt();
    displaysum(n, m, s);
  }
}