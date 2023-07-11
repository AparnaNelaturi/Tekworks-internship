import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first string :");
      String s1=sc.nextLine();
      System.out.println("enter second string :");
      String s2=sc.nextLine();
      System.out.println("Concatinated string is :");
      System.out.println(s1+s2);
    }
  }