import java.util.Scanner;
class Student
  {
   public static void main(String args[])
    {
      String studentid;
      int marks1,marks2,marks3,sum=0;
      double average;
      Scanner d=new Scanner(System.in);
      System.out.println("\n Enter student id :");
      studentid=d.next();
      System.out.println("\n Enter value of m1 :");
      marks1=d.nextInt();
      System.out.println("\n Enter the value of m2 :");
      marks2=d.nextInt();
      System.out.println("\n Enter the value of m3 :");
      marks3=d.nextInt();
      sum=marks1+marks2+marks3;
      System.out.println("\n sum is"+sum);
      average=sum/3;
      System.out.println("average"+average);
    }
  }