import java.util.Random;
import java.util.*;
public class Guess
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("find the random number:");
      int randomNumber = random.nextInt(100) +1;
      int attempt;
      while(true)
        {
          System.out.println("guess the number:");
          int number = sc.nextInt();
          attempt++;
          if(number <= 1 && number >= 100)
          {
            System.out.println("the guessing number is invalid");
          }else if(number<randomNumber)
          {
            System.out.println("the guessing number is too low");
          }else if(number>randomNumber)
          {
            System.out.println("the gessing number is too high");
          }else{
            System.out.println("congratulation the your attemp is :" + attempt);
          }
        }
    }
  }