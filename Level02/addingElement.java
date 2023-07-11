import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int arr[]={23,45,67,90,88};
        System.out.println("enter the index position you want");
        int pos=sc.nextInt();
        System.out.println("enter the element you want to intsert");
        int element=sc.nextInt();
        int b[]=new int[arr.length+1];
        for(int i=0;i<b.length;i++)
        {
          if(pos==i)
          {
              b[i]=element;
          }
          else if(pos<i)
          {
             b[i]=arr[i-1]; 
          }
          else
          b[i]=arr[i];
        }
        System.out.println("array elements are after inserting");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }


    }
}