import java.util.Random;
import java.util.Scanner;
class DiceGame 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the target value : ");
    int Targetvalue = sc.nextInt();
    int attempts=1;
    Random rand = new Random();
    do
      {
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        if(dice1+dice2 != Targetvalue)
        {
          attempts++;
        }
        else 
        {
          System.out.println("Number of attempts you took to win is :" +attempts);
        }
      }
      while();
  }
}
