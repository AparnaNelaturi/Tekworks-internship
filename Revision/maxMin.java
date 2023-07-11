import java.util.Scanner;
class minMax
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size :");
      int n=sc.nextInt();
      System.out.println("Enter the array elements :");
      int []arr=new int[n];
      int x=arr[0];
      minMax s=new minMax();
      s.min();
      s.max();
      void min()
        {
      for(int i=1;i<n;i++)
        {
          if(arr[i]<x)
          {
            x=arr[i];
          }
        }
      System.out.println(x);
    }
      void max()
        {
        for(int i=1;i<n;i++)
          {
            if(arr[i]>x)
            {
              x=arr[i];
            }
          }
        System.out.println(x);
        }
  }
  }