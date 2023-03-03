import java.util.Scanner;
class IgnoreCase
  {
    public static void main(String args[])
    {
      String string1=new String();
      String string2=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("give the data to the string1");
      string1=sc.nextLine();
      System.out.println("give the data to the string2");
      string2=sc.nextLine();
      System.out.println(string1==string2);
    }
  }