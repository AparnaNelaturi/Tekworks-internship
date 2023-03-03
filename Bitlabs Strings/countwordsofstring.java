import java.util.Scanner;
class Words
  {
    public static void CountnumberOfwords(String s1,int count)
    {
      int count=0;
      for(int i=0;i<=s1.length()-1;i++)
        {
          if(s1.charAt(i)!=' ')
          {
            count++;
          }
        }
      System.out.println("number of words is:"+count);
    }
    public static void main(String args[])
    {
      String s1=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to the s1");
      s1=sc.nextLine();
    }
   void CountnumberOfwords(s1,count);
  }