import java.util.*;
class SecondLargest{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Elements in Array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter values");
        for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
        for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[i]>arr[j])
                        {
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
            }
        System.out.println(arr[size-2]);
    }
}