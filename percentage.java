import java.util.Scanner;
class percentage
{
public static void main(String args[]);
{
int physics,chemistry,Biology,mathematics,computer,sum=0,percentage;
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter the marks in physics:");
physics=new sc.nextInt();
System.out.println("\n Enter the marks in chemistry:");
chemistry=new sc.nextInt();
System.out.println("\n Enter the marks in Biology:");
Biology=new sc.nextInt();
System.out.println("\n Enter the marks in mathematics:");
mathematics=new sc.nextInt();
System.out.println("\n Enter the marks in computer:");
computer=new sc.nextInt();
System.out.println("\n Total marks :")
sum=physics+chemistry+Biology+mathematics+computer;
System.out.println("\n Total marks gained by student :"+sum);
percentage=(sum/Total marks)*100;
Switch(percentage)
{
case 1:percentage>=90
System.out.println(percentage+"Grade A");
break;
case 2:percentage>=80
System.out.println(percentage+"Grdae B");
break;
case 3:percentage>=70
System.out.println(percentage+"Grdae C");
break;
case 2:percentage>=60
System.out.println(percentage+"Grdae D");
break;
case 2:percentage>=40
System.out.println(percentage+"Grdae E");
break;
case 2:percentage<40
System.out.println(percentage+"Grdae F");
break;
default:
System.out.println("\n please enter all the subject marks");
}
}
}