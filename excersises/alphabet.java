import java.util.*;
public class Alphabet
  {
    public static void main(String art[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the char :" );
        char c = new sc.next().CharAt(0);
      if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z'))
         System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + "is an alphabet.");
    }
  }