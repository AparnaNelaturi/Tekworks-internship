import java.util.*;
public class unique
  {
     public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to print unique element of Array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) 
        {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        } 
        System.out.print("Unique values in array are : ");
        Arrays.sort(arr);
        for (int i = 0; i < size; i++)
        {
            while (i < size - 1 && arr[i] == arr[i + 1])
            i++;
            System.out.print(arr[i] +" ");
        }
    }
}