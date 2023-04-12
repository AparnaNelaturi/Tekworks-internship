import java.util.*;
class binarysearch
  {
    public static  void binarysearch1(int arr[],int n,int keyelement)
    {
        int first= 0;
        int last=n-1;
        while(first<=last)
        {
        int mid=first+last/2;
        if(arr[mid]==keyelement)
        {
           System.out.println("Element is found at:"+mid);
          break;
        }
       else if(arr[mid]<keyelement)
       {
         last=mid-1;
       }
     else
       {
         first=mid+1;
       }  
    }
    }
  
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=s.nextInt();
      System.out.println("Enter the key element to search");
      int keyelement=s.nextInt();
      System.out.println("Enter the array elements");
      int arr[]=new int[n];
      for(int i=0;i<n-1;i++)
        {
          arr[i]=s.nextInt();
        }
      binarysearch1(arr,n,keyelement);
    }
}