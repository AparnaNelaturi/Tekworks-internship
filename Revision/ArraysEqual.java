import java.util.*;
class EqualArraysOrNot
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Elements in Array1");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter values");
        for(int i=0;i<size1;i++)
            {
                arr1[i]=sc.nextInt();
            }
        System.out.println("Enter No of Elements in Array2");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter values");
        for(int i=0;i<size2;i++)
            {
                arr2[i]=sc.nextInt();
            }
            int count=0;
        if(arr1.length==arr2.length)
            {
               for(int i=0;i<size1;i++)
                   {
                       if(arr1[i]==arr2[i])
                           count++;
                   }
                if(count==size1)
                    System.out.println("Two arrays are equal");
                else
                    System.out.println("Two arrays are not equal");
            }
            else
                System.out.println("Two arrays are not equal");
        }
    }