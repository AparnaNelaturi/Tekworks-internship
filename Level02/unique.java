import java.util.*;
class Unique
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=s.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          int count=1;
          for(int j=i+1;j<n;j++)
            {
              if(arr[i]==arr[j])
              {
              count++;
              }
            }
          if(count==1)
          {
            System.out.println(arr[i]);
          }
        }
    }
  }