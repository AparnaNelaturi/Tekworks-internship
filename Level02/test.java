import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size :");
      int n=sc.nextInt();
      System.out.println("array elements are :");
      int array[]=new int[n];
      for(int i=0;i<=array.length-1;i++)
        {
          array[i]=sc.nextInt();
        }
      int sum=0;
      for(int i=0;i<=array.length-1;i++)
        {
          sum=sum+array[i];
        }
      System.out.println("sum of the array elements are :"+sum);
    }
  }