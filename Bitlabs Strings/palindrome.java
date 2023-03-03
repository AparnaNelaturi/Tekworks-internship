import java.util.*;
class palindrome
  {
    public static void main(String args[])
    {
      String reverse="";
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string");
      string=s.nextLine();
      int l=string.length();
      for(int i=l-1;i>=0;i--)
      reverse=reverse+string.charAt(i);
      if(string.equals(reverse))
        System.out.println("given string is a palindrome");
        else
         System.out.println("Given string is not a palindrome");
    }
  }