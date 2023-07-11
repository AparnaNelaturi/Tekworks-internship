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
      System.out.println("second largest elmenet in the given array is :");
      for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n; j++)
            {
                 if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }  
        }
      System.out.println("array after sorting :");
      for(int i=0;i<n;i++)
        {
      System.out.println(a[i]);
    }
    }
  }