import java.util.Scanner;
class arr1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
      a[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    for(int i=0;i<m;i++)
  {
    int j,f;
    f=a[0];
    for(j=0;j<=n-1;j++)
      {
        a[j]=a[j+1];
      }
    a[j]=f;
  }
for(int i=0;i<n;i++)
  {
    System.out.println(a[i]+" ");
  }
  }
  }