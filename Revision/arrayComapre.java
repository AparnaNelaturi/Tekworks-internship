import java.util.*;
class Compare
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first array size :");
      int n1=sc.nextInt();
      System.out.println("Enter the first array elements :");
      int arr1[]=new int[n1];
      for(int i=0;i<n1;i++)
        {
          arr1[i]=sc.nextInt();
        }
      System.out.println("enter the second array size :");
      int n2=sc.nextInt();
      System.out.println("Enter the second array elements :");
      int arr2[]=new int[n2];
      for(int i=0;i<n2;i++)
        {
          arr2[i]=sc.nextInt();
        }
      Compare c=new Compare();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      c.check();
    }
    void check()
    {
      int count=0;
      if(arr1.length==arr2.length)
         {
           for(int i=0;i<n1;i++)
             {
               if(a[i]==b[i])
               {
                 conut++;
               }
             }
           if(count==n1)
           {
           System.out.println("both arrays are equal.");
         }
      System.out.println("both arrays are not equal.");
    }
      System.out.println("both arrays are not equal.")
  }
  }
