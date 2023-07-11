import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size :");
      int n=sc.nextInt();
      System.out.println("enter array elements :");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the index position which you want to remove :");
      int index=sc.nextInt();
      int b[]=new int[n-1];
      for(int i=0;i<n-1;i++)
        {
          if(i==index)
          {
            b[i]=a[i];
            continue;
          }
        }
      System.out.println(b[i]);
    }
  }