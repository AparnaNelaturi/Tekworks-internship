imort java.util.Scanner;
{
public static void main(String args[])
{
class LeapyearChecker
{
int y;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the year :");
y = obj.nextInt();
}
while(y%4 == 0 && y%400 == 0)
{
System.out.println(y+"is a leap year");
}
}
}
}