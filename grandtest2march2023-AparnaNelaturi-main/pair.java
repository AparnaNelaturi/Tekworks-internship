import java.util.Scanner;
class Pairs
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size :");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the value of sum :");
      int sum=sc.nextInt();
      getPairs(a,sum);
    }
    public static void getPairs(int a[],int sum)
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        for(int j=i;j<a.length;j++)
          if((a[i]+a[j])==sum)
            count++;
      System.out.println("count of pairs in the given array is :"+count);
    }
  }