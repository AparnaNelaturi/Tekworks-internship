import java.util.Scanner;
class Percentage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of subjects :");
int n=sc.nextInt();
System.out.println("Enter the subject's marks :");
int Physics=sc.nextInt();
int Chemistry=sc.nextInt();
int Biology=sc.nextInt();
int Mathematics=sc.nextInt();
int Computer=sc.nextInt();
int sum=Physics+Chemistry+Biology+Mathematics+Computer;
int Average=sum/n;
int Percentage=(Average/n)*100;
if(Percentage >= 90 && Percentage<=100)
System.out.println("Grade A");
else if(Percentage >= 80 && Percentage<=89)
System.out.println("Grade B");
else if(Percentage >= 70 && Percentage<=79)
System.out.println("Grade C");
else if(Percentage >=60 && Percentage <=69)
System.out.println("Grade D");
else if(Percentage >=40 && Percentage <=59)
System.out.println("Grade E");
else if(Percentage<40)
System.out.println("Grade F");
else
{
System.out.println("Entet valid inputs");
}
  }
}

