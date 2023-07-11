import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      char ch[]=s.toCharArray();
      int freq[]=new int[s.length()];
      for(int i=0;i<s.length();i++)
        {
          freq[i]=1;
          for(int j=i+1;j<s.length();j++)
            {
              if(ch[i]==ch[j])
              {
                freq[i]++;
                ch[j]='0';
              }
            }
        }
      System.out.println("frequency of each character in the given string is :");
      for(int i=0;i<freq.length;i++)
        {
          if(ch[i]!=' ' && ch[i]!='0')
          {
            System.out.println(ch[i]+"-"+freq[i]);
          }
        }
    }
  }