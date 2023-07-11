import java.util.Scanner;
class VowelCount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      char ch[]=s.toCharArray(s);
      int Acount=0;
      int Ecount=0;
      int Icount=0;
      int Ocount=0;
      int Ucount=0;
      for(int i=0;i<ch.length;i++)
        {
          if(ch[i]=='a' || ch[i]=='A')
          {
            Acount++;
          }
          else if(ch[i]=='e' || ch[i]=='E')
          {
            Ecount++;
          }
          else if(ch[i]=='i' || ch[i]=='I')
          {
            Icount++;
          }
          else if(ch[i]=='o' || ch[i]=='O')
          {
            Acount++;
          }
          else if(ch[i]=='u' || ch[i]=='U')
          {
            Acount++;
          }
          else
          {
            System.out.println("no vowels are there in the given string.");
          }
        }
      System.out.println("Frequency of A is :"+Acount);
      System.out.println("Frequency of E is :"+Ecount);
      System.out.println("Frequency of I is :"+Icount);
      System.out.println("Frequency of O is :"+Ocount);
      System.out.println("Frequency of A is :"+Ucount);
    }
  }