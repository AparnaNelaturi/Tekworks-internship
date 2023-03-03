import java.util.Scanner;
class TextAnalyzer
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String s1=sc.nextLine();
      Character(s1,ch);
      Words(s1,w);
    }
    public static String Character(String s1,)
    {
      char ch=s1.charAt(i);
      for(i=0;i<s1.length;i++)
        {
          if(ch>='a' || ch>='A' && ch<='z' || ch<='Z') 
        {
          int ch=0;
          ch++;
        }
      System.out.println("Total number of characters :"+ch);
        }
    }
    public static String Words(String s1,int w)
    {
     String str1[]=s1.split(" ");
      for(i=0;i<s1.length;i++)
        {
          int w=0;
          w++;
        }
     System.out.println("Total number of words :"+w);
    }
    public static String Lines(String s1,)
    {      
      char ch=s1.charAt(i);
      for(int i=0;i<s1.length();i++)
        {
          if(charAt(i)=='\n')
          {
          int l=0;
          l++;
          }
        }
      System.out.println("Total number of lines :"+l);
    }
  }