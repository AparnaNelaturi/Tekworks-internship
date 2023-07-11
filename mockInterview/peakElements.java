import java.util.*;
class PeakElement
  {
    public static void peakelement(int arr[],int arraysize)
    {
      int maxelement=arr[0],count=0;
      for(int i=1;i<=arraysize-1;i++)
        {
          if(arr[i]>maxelement)
          {
            maxelement=arr[i];
            count=i;
          }
        }
      System.out.println("peak element is:"+arr[count]);
    }
  public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
    System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int arr[]=new int[arraysize];
    System.out.print("enter the array elemnts:");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=s.nextInt();
      }
    peakelement(arr,arraysize);
    }
}