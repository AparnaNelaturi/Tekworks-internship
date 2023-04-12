import java.util.Scanner;
class Student
  {
    int StudentId;
    String StudentName;
    int rollNumber;
    long mobileNumber;
    int marks;
    String address;
    Student(int StudentId,String StudentName,int rollNumber,long mobileNumber,int marks,String address)
    {
      this.StudentId=StudentId;
      this.StudentName=StudentName;
      this.rollNumber=rollNumber;
      this.mobileNumber=mobileNumber;
      this.marks=marks;
      this.address=address;
    }
    int getStudentId()
    {
      return StudentId;
    }
    String getStudentName()
    {
      return StudentName;
    }
    int getrollNumber()
    {
      return rollNumber;
    }
    long getmobileNumber()
    {
      return mobileNumber;
    }
    int getMarks()
    {
      return marks;
    }
    String getAddress()
    {
      return address;
    }
  }
class StudentDetails
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student[]students=new Student[maxStudents];
      final int maxStudents=5;
      final int maxNameLength=30;
      final int maxAddressLength=100;
      for(int i=0;i<maxStudents;i++)
        {
          int StudentId=0;
          while(StudentId==0 || !isUniqueId(StudentId,students))
            {
              System.out.println("Enter student ID: (must be 5 digit number only)");
              StudentId=sc.nextInt();
              if(String.valueOf(StudentId).length()!=5)
              {
                System.out.println("student id must be 5 digit number only.");
                StudentId=0;
              }
              else if(!isUniqueId(StudentId,students))
              {
                System.out.println("student id must be unique.");
                StudentId=0;
              }
            }
          String StudnetName=null;
          while(StudentName=null || !isValidName(StudentName))
            {
              System.out.println("enter the student name :");
              StudentName=sc.nextLine();
              if(!isValidName(StudentName))
              {
                System.out.println("student name must contains letters only.");
                StudentName=null;
              }
            }
          int rollNumber;
          while(rollNumber==0 || rollNumber<0)
            {
              System.out.println("enter roll number(must be positive)");
              rollNumber=sc.nextInt();
              if(rollNumber<=0)
              {
                System.out.println("roll number must be a positive number.");
                rollNumber=0;
              }
            }
          long mobileNumber;
          while(mobileNumber==0 || !isValidMobileNumber(MobileNumber))
            {
              System.out.println("enter the mobile number must be 10 digits starting with 9 or 8 or 7 or 6 :");
              mobileNumber=sc.nextLong();
              if(String.valueOf(mobileNumber).length()!=10)
              {
                System.out.println("mobile number must be 10 digit number.");
                mobileNumber=0;
              }
              else if(!isValidMobileNumber(MobileNumber,mobileNumber))
              {
                System.out.println("mobile number contains digits only.");
              }
            }
          int marks;
          while(marks==-1 || marks<0 || marks>100))
            {
              System.out.println("Enter the marks : (must be  positive number and between 1 to 100 only)");
              marks=sc.nextInt();
              if(marks<0 || marks>100)
              {
                System.out.println("marks should be 2 digit number and positive only");
                marks=0;
              }
            }
          String address;
          while(address=null || !isValidAddress(address))
            {
              System.out.println("enter the student address must be between 5 to 100 characters only.");
              address=sc.nextLine();
              if(!isValidAddress(address))
              {
                System.out.println("student address must be 5 to 100 letters only.");
                address=null;
              }
            }
          students[i]=new Student(StudentId,StudentName,rollNumber,mobileNumber,marks,address);
        }
      System.out.println("Student details :");
      for(int i=0;i<maxStudents;i++)
        {
          Student student=students[i];
          System.out.println("Student ID :"+student.getStudentId());
          System.out.println("Student name :"+student.getStudentName());
          System.out.println("Student Roll Number :"+student.getrollNumber());
          System.out.println("Student mobilenumber :"+student.getmobileNumber());
          System.out.println("Student Marks :"+student.getMarks());
          System.out.println("Student Address :"+student.getAddress());
        }
      boolean isUnique(int StudentId,Student[] students)
        {
        for(int i=0;i<students.length;i++)
          {
            if(students[i]!=null && students[i].getStudentId()==StudentId)
            {
              return false;
            }
          }
        return true;
        }
      boolean isValidName(String StudentName)
        {
          if(StudentName.length()<2 || StudentName.length>maxNameLength)
        {
        return false;
        }
      for(int i=0;i<StudentName.length();i++)
        {
          if(!Character.isLetter(StudentName.charAt(i)))
          {
            return false;
          }
    return true;
    }
      boolean isValidMobileNumber(long mobileNumber)
        {
          String mobileString=String.valueOf(mobileNumber);
          int n=mobileString.length()
      char firstDigit=mobileString.charAt(0);
      if(n=10 && (firstDigit='6'|| firstDigit='7'||firstDigit='8' || firstDigit='9'))
        {
        System.out.println("valid moible number");
        }
        }
    boolean isValidAddress(String address)
    {
      return address.length()>= 5 && address.length()<=maxAddressLength;
    }
  }