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
      System.out.println("negative elements in the array are :");
      for(int i=0;i<n;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }