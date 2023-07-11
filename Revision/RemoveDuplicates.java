import java.util.*;
class Duplicate
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size :");
      int size=sc.nextInt();
      System.out.println("Enter values :");
      int arr[]=new int[size];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      removeDuplicates(arr,size);
    }
    public static void removeDuplicates(int arr[],int size)
    {
      for(int i=0;i<=size-1;i++)
        {
          for(int j=i+1;i<=size-1;j++)
            {
              if(arr[i]==arr[j])
              {
                arr[i]=-1;
              }
            }
        }
      for(int k=0;k<=arr.length-1;k++)
        {
          if(arr[k]!=-1)
          {
            System.out.println(arr[k]);
          }
        }
    }
  }