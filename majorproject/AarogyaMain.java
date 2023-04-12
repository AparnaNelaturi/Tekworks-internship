import java.util.*;
class AarogyaMain
  {
    public static void main(String[] args)
    {
      char ch;
      int option1;
      Scanner s=new Scanner(System.in);
      ArogyaImplementation obj=new ArogyaImplementation();
  System.out.println("1.MEDICINE RECORD");
  System.out.println("2.PATIENT REGISTRATION");
  System.out.println("3.PATIENT PROFILE");
  System.out.println("4.CONTACT US");
      
      do{
        System.out.println("enter your choice");
        option1=s.nextInt();
        switch(option1)
          {
            case 1: obj.Medicine_Record();
              break;
            case 2: obj.Patient_Registration();
              break;
            case 3: obj.Patient_Profile();
              break;
            case 4: obj.Contact_us();
              break;
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
        
         
        }
      }