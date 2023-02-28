mport java.util.Scanner;
import java.util.Random;
class Rockpaperscissor
  {
    public static void main(String arg[])
    {
      int userchoice,computerchoice,rock,paper,scissor;
      Scanner S=new Scanner(System.in);
      Random  R=new Random();
      rock=0;
      paper=1;
      scissor=2;
      System.out.println("ROCK-PAPER-SCISSOR GAME");
      System.out.println("enter choice rock=0,paper=1,scissor=2");
      userchoice=S.nextInt();
      while(userchoice>2)
        {
          System.out.println("give number b/w 0 and 2");
          userchoice=S.nextInt();    
    }
    if(userchoice==rock)
{
  System.out.println("user chose rock");
}
    else 
{
  if(userchoice==paper)
  {
  System.out.println("user chose paper");
  }
  else
  {
    System.out.println("user chose scissor");
  }
}
    computerchoice=R.nextInt(3);
  if(computerchoice==rock)
  {
   System.out.println("computer chose rock");
  }
  else
  {
    if(computerchoice==paper)
    {
      System.out.println("computer chose paper");
    }
    else
    {
     System.out.println("computer chose scissor");
  }
  }
      while(userchoice==computerchoice)
        {
          System.out.println("draw try again");
          userchoice=S.nextInt();
          while(userchoice>2)
            {
            System.out.println("given number b/w 0and2");
            userchoice=S.nextInt();
            }
          computerchoice=R.nextInt(3);
          if(userchoice==rock)
          {
            System.out.println("user chose rock");
          }
          else
          {
            if(userchoice==paper)
            {
              System.out.println("user chose paper");
            }
            else
            {
              System.out.println("user chose scissor");
            }
          }
          if(computerchoice==rock)
          {
            System.out.println("computer chose rock");
          }
          else
          {
            if(computerchoice==paper)
            {
              System.out.println("computer chose paper");
            }
            else
            {
              System.out.println("computer chose scissor");
            }
          }
        }
      //result
      if(computerchoice==rock)
      {
        if(userchoice==paper)
        {
          System.out.println("userwins!");
        }
        else
        {
          System.out.println("computer wins");
        }
      }
    else if(computerchoice==paper)
    {
    if(userchoice==rock)
        {
          System.out.println("computerwins");
        }
        else
        {
          System.out.println("user wins!");
        }
    }
      else if(userchoice==rock)
      {
        System.out.println("user wins");
          }
      else
      {
        System.out.println("computer wins");
      }
    }
  }