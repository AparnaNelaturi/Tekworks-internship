import java.util.Scanner;
abstract class Employee
  {
    String name;
    int id;
    String address;
    String email;
    String mobilenumber;
    double basicPay;
    Employee(String name,int id,String address,String email,String mobilenumber,double basicPay)
    {
      this.name=name;
      this.id=id;
      this.address=address;
      this.email=email;
      this.mobilenumber=mobilenumber;
      this.basicPay=basicPay;
    }
    abstract double calculateDA();
    abstract double calculateHRA();
    abstract double calculatePF();
    abstract double calculateStaffClubFunds();
    double calculateGrossSalary()
    {
      return basicPay+calculateDA()+calculateHRA()+calculatePF()+calculateStaffClubFunds();
    }
    double calculateNetSalary()
    {
      return calculateGrossSalary()-calculatePF();
    }
    void printPayslip()
    {
      System.out.println("Employee Name :"+name);
      System.out.println("Employee ID :"+id);
      System.out.println("Employee Address :"+address );
      System.out.println("Employee Email :"+email);
      System.out.println("Employee Mobile Number :"+mobilenumber);
      System.out.println("Employee BasicPay is :"+basicPay);
      System.out.println("Employee DA :"+calculateDA());
      System.out.println("Employee HRA :"+calculateHRA());
      System.out.println("Employee PF :"+calculatePF());
      System.out.println("Employee Staff club funds :"+calculateStaffClubFunds());
      System.out.println("Employee Salary :"+calculateGrossSalary());
      System.out.println("Employee N :"+name);
    }
  }
class Programmer extends Employee{
  Programmer(String name,int id,String address,String email,String mobilenumber,double basicPay)
  {
    super(name,id,address,email,mobilenumber,basicPay);
  }
  double calculateDA()
  {
    return 0.97*basicPay;
  }
  double calculateHRA()
  {
    return 0.1*basicPay;
  }
  double calculatePF()
  {
    return 0.12*basicPay;
  }
  double calculateStaffClubFunds()
  {
    return 0.001*basicPay;
  }
}
class Teamlead extends Employee{
  Teamlead(String name,int id,String address,String email,String mobilenumber,double basicPay)
  {
    super(name,id,address,email,mobilenumber,basicPay);
  }
  double calculateDA()
  {
    return 0.97*basicPay;
  }
  double calculateHRA()
  {
    return 0.1*basicPay;
  }
  double calculatePF()
  {
    return 0.12*basicPay;
  }
  double calculateStaffClubFunds()
  {
    return 0.001*basicPay;
  }
}
class AssistantProjectManager extends Employee{
  AssistantProjectManager(String name,int id,String address,String email,String mobilenumber,double basicPay)
  {
    super(name,id,address,email,mobilenumber,basicPay);
  }
  double calculateDA()
  {
    return 0.97*basicPay;
  }
  double calculateHRA()
  {
    return 0.1*basicPay;
  }
  double calculatePF()
  {
    return 0.12*basicPay;
  }
  double calculateStaffClubFunds()
  {
    return 0.001*basicPay;
  }
}
class ProjectManager extends Employee{
  ProjectManager(String name,int id,String address,String email,String mobilenumber,double basicPay)
  {
    super(name,id,address,email,mobilenumber,basicPay);
  }
  double calculateDA()
  {
    return 0.97*basicPay;
  }
  double calculateHRA()
  {
    return 0.1*basicPay;
  }
  double calculatePF()
  {
    return 0.12*basicPay;
  }
  double calculateStaffClubFunds()
  {
    return 0.001*basicPay;
  }
}
class PayrollSystem
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the programmer's name :");
      String name=sc.nextLine();
      System.out.println("Enter the programmer's ID :");
      int id=sc.nextInt();
      System.out.println("Enter the programmer's address :");
      String address=sc.nextLine();
      System.out.println("Enter the programmer's email :");
      String email=sc.nextLine();
      System.out.println("Enter the programmer's mobilenumber :");
      String mobilenumber=sc.nextLine();
      System.out.println("Enter the programmer's basicPay :");
      double basicPay=sc.nextDouble();
      Programmer programmer=new Programmer(name,id,address,email,mobilenumber,basicPay);
      programmer.printPayslip();
      Teamlead teamlead=new Teamlead(name,id,address,email,mobilenumber,basicPay);
      teamlead.printPayslip();
      AssistantProjectManager Apm=new AssistantProjectManager(name,id,address,email,mobilenumber,basicPay);
      Apm.printPayslip();
      ProjectManager pm=new ProjectManager(name,id,address,email,mobilenumber,basicPay);
      pm.printPayslip();
    }
  }
