import java.util.Scanner;
class CharIndex
  {
    public static void main(String args[])
    {
      String string1=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string1");
      string1=s.nextLine();
      System.out.println(string1);
      //retrieving few characters
      System.out.println(string1.charAt(3));
     System.out.println(string1.charAt(1));
    }
  }