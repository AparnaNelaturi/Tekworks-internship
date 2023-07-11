import java.util.Scanner;
class test
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
              capitalizeString=capitalizeString+first.toUpperCase()+second+" ";
              break;
            }
        }
      System.out.println("string after the capilization is :");
      System.out.println(capitalizeString);
    }
  }