import java.util.Scanner;
public class Alphabet
  {
    public static void main(String art[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the char :" );
        char c = new sc.next().CharAt(0);
      while((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z'))
        {
         System.out.println(c + " is an alphabet.");
        }
            System.out.println(c + "is not an alphabet.");
    }
  }