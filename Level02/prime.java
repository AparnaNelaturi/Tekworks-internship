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
      System.out.println("prime numbers in the array are :");
      prime(a,n);
    }
    public static void prime(int a[],int n)
    {
      for(int i=0;i<a.length;i++)
{
int count=0;
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
count++;
}
}if(count==2)
{
System.out.println(a[i]);
}
}
  }
  }