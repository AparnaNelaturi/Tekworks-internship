import java.util.*;
class Index
  {
    public static void main(String arg[])
    {
      
      Scanner s=new Scanner(System.in);
       System.out.println("enter the string1");
      String string1=s.nextLine();
      character(string1);
    }
    public static void character(String string1)
    {
      System.out.println(string1.indexOf('c'));
    }
  }