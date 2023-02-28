import java.util.Scanner;
{
class GradeCalculator
{
public static void main(String args[]);
{
int s1,s2,s3,sum,avg;
Scanner obj=new Scanner(System.in);
System.out.println("Enter marks in s1 :");
s1=obj.nextInt();
System.out.println("Enter marks in s2 :");
s2=obj.nextInt();
System.out.println("Enter marks in s3 :");
s3=obj.nextInt();
sum=s1+s2+s3;
avg=(sum/3)*100;
}
if(avg>=70 && avg<=100)
{
System.out.println(avg+"your grade is A");
}
else if(avg>=50 && avg<=69)
{
System.out.println(avg+"your grade is B");
}
else if(avg>=35 && avg<=49)
{
System.out.println(avg+"your grade is C");
}
else
{
System.out.println("you are failed");
}
}