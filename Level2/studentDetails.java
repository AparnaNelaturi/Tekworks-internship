// Student Total and Avg, Pass or Fail , Grade
// below 50 ---> C 51-70 --> B  71-80 --> A above 80 
import java.util.Scanner;
class Student
  {
     public static void main(String args[])
    {
        int sno,m1,m2,m3,tot;
        String sname;
        float savg;
     Scanner sc=new Scanner(System.in);

 

  System.out.println("Enter Student Number");
  sno=sc.nextInt();
  System.out.println("Enter Student Name:");
  sname=sc.next();
  System.out.println("Enter Student Marks:");
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();

 

  tot=m1+m2+m3;
  savg=tot/3;

  System.out.println("STUDENT DETAILS");
  System.out.println("The Student Number is:"+sno);
  System.out.println("The Student Name   is:"+sname);
  System.out.println("The Student Marks");
  System.out.println("Maths:"+m1);
  System.out.println("Physics:"+m2);
  System.out.println("Chemistry:"+m3);      
  System.out.println("The Student Total is:"+tot);
  System.out.println("The Student Average is:"+savg);

 

   if(m1>=40 && m2>=40 && m3>=40)
   {
       System.out.println("Result : Pass");
       if(savg<=50)
         System.out.println("Grade : C");
       else if(savg>=51 && savg<=70)
         System.out.println("Grade : B");
       else if(savg>=71 && savg<=80)
         System.out.println("Grade : A");
       else            
         System.out.println("Student Pass in Distension");
   }
   else
   {
        System.out.println("Result : Fail");
   }   

    }
  }