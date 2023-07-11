import java.util.Scanner;
class LargestWord
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String s=sc.nextLine();
      String words[]=s.split("");
      int maxLength=0;
      int n=words[].length();
      String longestWord="";
      for(int i=0;i<words.length;i++)
        {
          if(n>maxLength)
          {
            maxLength=words[i].length;
            longestWord=words[i];
          }
        }
      System.out.println("The longest word in the given string is :"+longestWord);
      System.out.println("the maxlength of the longest word is :"+maxLength);
    }
  }