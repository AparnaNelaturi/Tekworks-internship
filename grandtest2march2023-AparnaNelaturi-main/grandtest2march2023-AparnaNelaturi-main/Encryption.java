import java.util.Scanner;
class Encryption
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      char ch[]=s1.toCharArray();
      for(int i=0;i<ch.length;i++)
        {
          if(i%2==0)
          {
            System.out.println(ch[i]);
          }
        }
      for(int i=0;i<ch.length;i++)
        {
          if(i%2!=0)
          {
            System.out.println(ch[i]);
          }
        }
    }
  }