import java.util.Scanner;
class AgeCalculator
{
public static void main(String args[]);
 {
  int bday,bmon,byear,cday,cmon,cyear,fday,fmon,fyear;
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter your birth date:");
  bday = obj.nextInt();
  System.out.println("Enter your birth month:") 
  bmon = obj.nextInt();
  System.out.println("Enter your birth year:")
  byear =obj.nextInt();
  //get current date from system
  cday=java.time.LocalDate.now().getDayofMonth();
  cmon=java.time.LocalDate.now().getMonthvalue();
  cyear=java.time.LocalDate.now().getyear();
  //checking the condition
  if(cday>=bday && cmon>=bmon && cyear>=byear)
    {
     bday=cday-bday;
     bmon=cmon-bmon;
     byear=cyear-byear;
     System.out.pritln("your age is"+bday+"days"+bmon+"months"+byear+"years");
    }
  else
   {
    //to find days
    bday=(cday+30)-bday;
   cmon--;
    cmon+=bday/30;
    bday=bday%30;
    //to fing months
    bmon=(cmon+12)-bmon;
    cyea--;
    cyear+=bmon/12;
    bmon=bmon%12;
    byear=cyear-byear;
    System.out.println("your age is:"+bday+"days"+bmon+"months"+byear+"years");
  }
 }
}
  

import java.util.*;

public class Agecalculator {
  public static void main(String args[]) {
    System.out.println("Age Calculator Application");
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Date of Birth year");
    int year = s.nextInt();
    
    Agecalculator a=new Agecalculator(); 
    a.calculator(year);
   
  }
  public static void calculator(int  year)
  {
    int presentyear = 2023;
     if (year > 0 && year < presentyear) {

      int finalage = presentyear - year;
      System.out.println("Your present age is" + finalage);
      if (finalage >= 18) {
        System.out.println("You are adult");
      } 
      else {
        System.out.println("You are minor");
      }
    } 
    else {
      System.out.println("Please enter valid year");
    }
  }
}