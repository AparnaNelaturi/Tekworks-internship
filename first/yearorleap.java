import java.util.*;
class leapyear
  {
       public static void main(String []s)
    {
        int year;
      Scanner sc=new Scanner (System.in);

      try
        {
          System.out.print("Enter year:");
          year=sc.nextInt();

          if((year%400=0)||(year%100!=0 && year%4==0))
              System.out.println(year+" is a leap year.");
          else
              System.out.println(year+" is not a leap year.");
        }
    }
    
  }