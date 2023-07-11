// print the last word in the string
/* import java.util.Scanner;
class last
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      String words[]=s.split(" ");
      if(words.length==0)
      {
        System.out.println("no words are there in the given string.");
      }
      else
      {
        String lastword=words[words.length-1];
        System.out.println("last word in the string is :");
        System.out.println(lastword);
        System.out.println("the reversed last word is :");
        String reversedLastWord=" ";
        for(int i=lastword.length()-1;i>=0;i--)
          {
            reversedLastWord+=lastword.charAt(i);
          }
        System.out.println(reversedLastWord);
      }
    }
  } */
import java.util.*;
class LastWordReverse
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String arr[]=str.split(" ");
      for(int i=arr.length-1;i>=0;i--)
        {
          String x=arr[i];
          for(int j=x.length()-1;j>=0;j--)
            {
              System.out.print(x.charAt(j));
            }
          break;
        }
    }
  }