import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string :");
      String s=sc.nextLine();
      char ch=s.charAt(2);
      System.out.println("character at given index from the string is :"+ch);
      for(int i=0;i<s.length();i++)
        {
          System.out.println(s.charAt(i));
        }
    }
  }