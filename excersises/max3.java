import java.util.Scanner;
public class Max
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x :");
x=new sc.nextInt();
System.out.println("Enter the value of y :");
y=new sc.nextInt();
System.out.println("Enter the value of z :");
z=new sc.nextInt();
if(x>y && x>z)
{
System.out.println(" \n The largest number is :"+x);
}
else if(y>x && y>z)
{
System.out.println("\n The largest number is"+y);
}
else if("z>x && z>y")
{
System.out.println("\n The largest number is"+z);
}
else
{
Syustem.out.println("\n Either two values are equal or three values are equal")
}
}
}