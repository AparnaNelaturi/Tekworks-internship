import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size :");
      int n=sc.nextInt();
      System.out.println("enter elements :");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the index position where you want to insert :");
      int index=sc.nextInt();
      System.out.println("enter the element which you want to insert :");
      int element=sc.nextInt();
      int b[]=new int[n+1];
      for(int i=0;i<n+1;i++)
        {
          if(i<index)
          {
            b[i]=a[i];
          }
          else if(i==index)
          {
            b[i]=element;
          }
          else
          {
            b[i]=a[i-1];
          }
        }
      for(int i=0;i<n+1;i++)
        {
          System.out.println(b[i]);
        }
    }
  }