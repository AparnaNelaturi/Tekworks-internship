
import java.util.Scanner;
class InvalidNameException extends Exception
  {
    public InvalidNameException(String message)
    {
      super(message);
    }
  }
class Employee
  {
    String name;
   // int age;
    public Employee(String name){
    this.name=name;
    }
    
  
    public void checkName() throws InvalidNameException
    {
     
      char[] names = name.toCharArray();
      for(int i=0;i<names.length;i++){
      if(names[i] >= '0' && names[i] <= '9'){
        throw new InvalidNameException("this name is "+ name + "invalid");
      }
        System.out.println("name is valid:" + name);
        }
  }
  }
 public class EmployeeNameChecking
  {
  public static void main(String[] args)
        {
          
        Employee em = new Employee("vasu");
        Employee em1=new Employee("0383");
          
          try{
        em.checkName();
        em1.checkName();
          }
          catch(InvalidNameException e){
            System.out.println("invalid exception is " + e.getMessage());
          }
        
      }
  }
