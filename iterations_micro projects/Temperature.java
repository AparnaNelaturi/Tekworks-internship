import java.util.Scanner;
class Temperature
{
public static void main(String args[])
{
double f,c,n;
Scanner sc=new Scanner(System.in);
System.out.println("choose the type of conversion : 1.fahrenheit to celsius 2.celsius to fahrenheit");
int ch=sc.nextInt();
if(n==1)
{
System.out.println("Enter the fahrenheit temperature :");
f=sc.nextDouble();
c=(f-32)*5/9;
System.out.println("celsius temperature is"+c);
}
else if(n==2)
{
System.out.println("Enter the celsius temperature :");
c=sc.nextDouble();
f=((9*c)/5)+32;
System.out.println("fahrenheit temperature :"+f);
}
else
{
System.out.println("please choose a valid choice")
}
}
}