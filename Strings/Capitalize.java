// write a java program ot capitalize the each word in the string
import java.util.Scanner;
class Capitalize
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      String words[]=s.split(" ");
      String capitalizeString=" ";
      for(int i=0;i<words.length;i++)
        {
          String word=words[i];
          for(int j=0;j<word.length();j++)
            {
          String first=word.substring(0,1);
              String second=word.substring(1);
          capitalizeString+=first.toUpperCase()+second+" ";
              break;
        }
    }
      System.out.println("string after capiralization is :");
      System.out.println(capitalizeString);
  }
  }
