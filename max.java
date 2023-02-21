import java.util.Scanner;
public class Max
{
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x :");
x=new sc.nextInt();
System.out.println("Enter the value of y :");
y=new sc.nextInt();
if(x>y)
{
System.out.println(" \n The largest number is :"+x);
}
else if(x<y)
{
System.out.println("\n The largest number is"+y);
}
else
{
System.out.println("\n Both are equal")
}
}
}