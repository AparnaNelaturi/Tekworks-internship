import java.util.Scanner;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      String words[]=s.split(" ");
      String reverseString=" ";
      for(int i=0;i<words.length;i++)
        {
          String word=words[i];
          String reverseWord=" ";
          for(int j=word.length()-1;j>=0;j--)
            {
              reverseWord=reverseWord+word.charAt(j);
            }
          reverseString=reverseString+reverseWord+" ";
        }
      System.out.println("input string is :"+s);
      System.out.println("after reversing the string is :"+reverseString);
    }
  }