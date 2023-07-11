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
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      int b[]=new int[n];
      for(int j=0;j<b.length;j++)
        {
          b[j]=a[j];
        }
      System.out.println("after copying the elements are :");
      for(int j=0;j<n;j++)
        {
      System.out.println(b[j]);
    }
    }
  }