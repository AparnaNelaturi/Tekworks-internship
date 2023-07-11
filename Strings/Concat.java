//write a java program to concat two strings without using the library function
import java.util.Scanner;
class Concat
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first string :");
      String s1=sc.nextLine();
      System.out.println("enter second string :");
      String s2=sc.nextLine();
      String s3=s1+" "+s2;
      System.out.println(s3);
    }
  }