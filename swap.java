import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter value of a:");
a=new sc.nextInt();
System.out.println("\n Enter value of b:");
b=new sc.nextInt();
System.out.println("before swapping :");
System.out.println("\n value of a:"+a);
System.out.println("\n value of b:"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping :");
System.out.println("\n value of a:"+a);
System.out.println("\n value of b:"+b);
}
}