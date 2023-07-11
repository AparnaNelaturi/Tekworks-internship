import java.util.Scanner;
public class maximum
{
   public static void main(string ars[])
   {
       int x=20;
       int y=50;
       int z=90;
        Scanner s= new Scanner(System. in);
        System.out.println("enter the first number:"); 
        x = s. nextIn();
       System.out.println("enter the second number:"); 
        y = new Scanner(System. in);
       System.out.println("enter the third number:");
        z = new Scanner (System. in);
        if(x > y && x > z)
       {
       System.out.println("largest number is:"+x);
       }
       else if(y > z)
       {
             System.out.println("largest number is:"+y);
       }
       else
       {
         System.out.println("largest number is:"+z);     
       }
   }
}