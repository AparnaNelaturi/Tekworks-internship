import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String s=sc.nextLine();
      System.out.println("Enter the character which you want to find the index :");
      char character=sc.next.charAt(0);
      for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)==character)
          {
            System.out.println(i);
            break;
          }
        }
      else
      {
        System.out.println()
      }
    }
  }