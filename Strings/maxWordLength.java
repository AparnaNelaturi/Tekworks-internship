// write a java program which can be able to display the maximum length word.
import java.util.Scanner;
class MaxWord
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      String words[]=s.split(" ");
      String maxWord=words[0];
      for(int i=0;i<words.length;i++)
        {
          for(int j=i+1;j<words.length;j++)
            {
          if(words[i].length()<words[j].length())
          {
            maxWord=words[j];
          }
        }
    }
      System.out.println("maximum length word in the given string is :"+maxWord);
  }
  }