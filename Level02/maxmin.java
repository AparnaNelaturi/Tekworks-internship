import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size :");
      int n=sc.nextInt();
      System.out.println("enter array elements :");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("minimum elment in the array is :");
      int min=a[0];
      for(int i=1;i<n;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println(min);
      System.out.println("maximum elmenet in the given array is :");
      int max=a[0];
      for(int i=1;i<n;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println(max);
    }
  }