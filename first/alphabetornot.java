import java.util.Scanner;
public class Alphabet
  {
    private static Scanner sc;
    public static void main(String art[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("\n Enter the c:");
      ch=sc.next().CharAt(0);
      if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z'))
         System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + "is an alphabet.");
    }
  }