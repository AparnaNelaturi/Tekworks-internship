import java.util.Scanner;
class StringTokenizer1
  {
    public  static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s="12 error welcome 76468";
      StringTokenizer st=new StringTokenizer(s);
      System.out.println(s.countTokens());
      while(s.hasMoreTokens())
        {
          System.out.println(st.nextToken());
        }
    }
  }