import java.util.*;
class Numberguess
  {
    public static void main(String args[])
  {
    System.out.println("NUMBER GUESSING GAME");
    char option;
    do
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Guess the number:");
      int number=s.nextInt();
      Random r=new Random();
      System.out.println("enter system limit:");
      int limit=s.nextInt();
      int system_guess=r.nextInt(limit);
      System.out.println("system Random number is:"+system_guess);
      if(number==system_guess)
       {
         System.out.println("your guess is correct");
       }
      else
      {
        System.out.println("your guess is wrong");
      }
   System.out.println("do you want to repeat the process");
      
     option=s.next().charAt(0);
    
    }
    while(option!='n');
  }
  }
