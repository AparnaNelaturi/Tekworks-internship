import java.util.*;
class InsertionSort
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int size=sc.nextInt();
    System.out.println("Enter array elements");
    int array[]=new int[size];
    for(int i=0;i<size;i++)
      {
        array[i]=sc.nextInt();
      }
     displayInsertionSort(array,size);
    }
     static void displayInsertionSort(int array[],int size)
        {
            int min=0;
            for(int i=1;i<n;i++)
              {
                int key=arr[i];
                int j=j-1;
                while(j>=0 && arr[i]> key)
                  {
                    arr[j+1]=arr[j];
                    j=j-1; 
                  }
                arr[j+1]=key;
                System.out.println("pass"+i);
                printArray(arr);
              }
}
}
