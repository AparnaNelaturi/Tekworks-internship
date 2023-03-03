import java.util.*;
class StringPalindrome
  {
    public static void main(String args[])
    {
      String str=new String();
      Scanner s=new Scanner(System.in);
      str=s.nextLine();
      s1=(str.countTokens());
      System.out.println(s1);
    boolean isPalindrome = true;
     int len = str.length();
  for (int i = 0; i < len / 2; i++) 
   {
   if (str.charAt(i)!=str.charAt(len - i - 1))
       {
        isPalindrome = false;
         break;
       }
   }
        if (isPalindrome)
        {
            System.out.println(str + " is a palindrome.");
          StringBuffer sb=new StringBuffer(str);
          String replaceString=str.replace(str,"palindrome");
          System.out.println(replaceString);
        } 
        else
        {
            System.out.println(str + " is not a palindrome.");
        }
    }
  }
  