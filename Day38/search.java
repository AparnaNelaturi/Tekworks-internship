import java.util.*;
class LinearSearch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of elements :");
      int n=sc.nextInt();
      System.out.println("enter the elements :");
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the element to find the index :");
      int element=sc.nextInt();
      int flag=0;
      for(int i=0;i<n;i++)
        {
          if(arr[i]==element)
          {
            System.out.println("index position of the given element is :"+i);
            flag=1;
            break;
          }
        }
          if(flag==0){
            System.out.println("element is not found");
          }
        }
    }
  