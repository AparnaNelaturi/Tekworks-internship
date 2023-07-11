//Hierarchical Inheritance
import java.util.Scanner;
Class College
{
String Department;
String Sections;
}
Class TeluguMedium extends College
{
void display()
{
System.out.println(Department);
System.out.println(Sections);
}
}
class EnglishMedium extends College
{
void show()
{
System.out.println(Department);
}
}
class Main
{
public static void main(String argts[])
{
Scanner sc=new Scanner(System.in);
College c=new College();
System.out.println(c.display("CSE","A1"));
c.show("ECE");
}
}