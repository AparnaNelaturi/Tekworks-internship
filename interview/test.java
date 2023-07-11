import java.util.Scanner;
class SecondLargest
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("array size :");
      int n=sc.nextInt();
      int large=arr[0];
      System.out.println("Enter array elements :");
      int array[]=new int[n];
      for(int i=0;i<array.length;i++)
        {
          if(large<arr[i])
          {
            large=arr[i];
          }
        }
      System.out.println("largest number in the array is :"+large);
    }
  }