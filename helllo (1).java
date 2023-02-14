
    import java.util.Scanner;
class GetStudentDetails
{
      public static void main(String args[])
      {
          String name;
          int roll, m1, m2,m3,age;
          Scanner SC=new Scanner(System.in);//We write the stdudent details in dynamic data using scanner
           
          System.out.println("enter name: ");
          name=SC.nextLine();
          System.out.println("Enter Roll Number: ");
          roll=SC.nextInt();
          System.out.println("Enter marks in m1, m2 and m3: ");
          m1=SC.nextInt();
          m2=SC.nextInt();
          m3=SC.nextInt();
          System.out.println("Enter her age:")
          age=SC.nextInt();
          
           
          int total=m1+m2+m3;
          float percentage=(float)total/300*100;
           
          System.out.println("Roll Number:" + roll);
          System.out.println("Name: "+name);
          System.out.println("Marks (m1,m2, English): " +m1+","+m2+","+m3);
          System.out.println("Total: "+total);
          System.out.println("Percentage:"+ percentage);
          System.out.println("age:"+age);
      }
          
}
