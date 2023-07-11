//) Java Program to count the total number of characters in a string.
import java.util.Scanner;
class Count
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Count c=new Count();
      System.out.println("enter string :");
      String s=sc.nextLine();
      c.CharacterCount(s);
    }
    void CharacterCount(String s)
    {
      int count=0;
      for(int i=0;i<s.length();i++)
        {
          System.out.print(s.charAt(i));
          if(s.charAt(i)==' ')   // IGNORE SPACES IN THE TEXT
          {
            count=count;
          }
          else
          count++;
        }
      System.out.println();
      System.out.println("number of characters in the string is :"+count);
    }
  }