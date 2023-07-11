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
      for(int i=0 ; i<n-1; i++)
        {
            for(int j=i; j<n-1 ; j++)
            {
                 if(a[i]>a[j+1]){
                    int temp = a[j+1];
                    a[i]=a[j+1];
                    a[j]=temp;
                }
            }
               
        }
      System.out.println(a[n-1]);
    }
  }