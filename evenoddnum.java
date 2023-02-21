import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n: ");
n=sc.nextInt();
if(n%2==0)
{
System.out.println(n+"\n is an even number");
}
else
{
System.out.println(n+"\n is an odd number");
}
}
}