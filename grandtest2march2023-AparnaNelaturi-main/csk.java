import java.util.Scanner;
class Csk
  {
    public static void funny(char a[])
    {
      int s,b,c;
      for(int i=0;i<a.length-3;i++)
        {
          s=a[i],b=a[i+1],c=a[i+2];
          if(((b-s)==1) && ((c-b)==1))
          {
            System.out.println("Yes");
            return;
          }
        }
      System.out.println("No");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(Systemin);
      String s=sc.nextLine();
      char ch[]=s.toCharArray();
      funny(ch);
    }
  }