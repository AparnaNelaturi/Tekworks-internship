import java.util.Scanner;
class Lexicographical
  {
    public static void main(String args[])
    {
      String s1=new String();
      String s2=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to the s1 :");
      s1=sc.nextLine();
      System.out.println("Give the data to s2:");
      s2=sc.nextLine();
      System.out.println(s1.compareTo(s2));
    }
  }