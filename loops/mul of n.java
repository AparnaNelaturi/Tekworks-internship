import java.util.Scanner;
class mulofn
  {
    public static void main(String args[])
    {
      int num,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the num :");
      for(i=num;i<10;i++)
        {
          for(j=1;j<=10;j++)
            {
              System.out.println(i+"*"+j+"="i*j);            }
        }
      System.out.println("------")
    }
  }

}
import java.util.Scanner;
public class MulTable
  {
    publilc static vpoid main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("\n Enter the number :");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++)
        {
          System.out.println(n+"*"+i+"="+n*i);
        }
    }
  