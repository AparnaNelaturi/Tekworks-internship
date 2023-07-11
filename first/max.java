public class max example
{
public static void main(String args[])
{
int x,y;
Scanner=new Scanner(System.in);
System.out.println("enter the value of x:");
System.out.println("entre the value of y:")
x=Scanner.nextInt();
y=Scanner.nextInt();
if(x>y)
{
System.out.println("\n The largest number is="+x)
}
else if(x<y)
{
System.out.println("\n The smallest number is ="+y)
else
{
System.out.println("both are equal \n")
}
}
}



import java.util.Scanner;
public class checkNum
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num :");
      System.out.print("enter a value :");
      int num = sc.nextInt();
      
      if(num > 0){
        System.out.println("num is positive");
      }​​else if(num<0){​​
        System.out.println("num is negative");
      }​​else{​​
        System.out.println("num is zero");
      }​​
    }​​
  }​​
