import java.util.Scanner;
class student
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter student name :");
      String sname=sc.nextLine();
      System.out.println("Enter student number :");
      int sno=sc.nextInt();
      System.out.println("Enter the three subject marks :");
      int m1=sc.nextInt();
      int m2=sc.nextInt();
      int m3=sc.nextInt();
      int total=m1+m2+m2;
      int average=total/3;
      System.out.println(sno+":"+sname+"Total marks are :"+total+"Average is"+average);
    }
  }