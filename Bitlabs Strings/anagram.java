import java.util.Scanner;
class Anagram
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to s1 :");
      String s1=new String(sc.nextLine());
      System.out.println("Give the data to s2 :");
      String s2=new String(sc.nextLine());
      s1=s1.toLowerCase();
      s2=s2.toLowerCase();
      int c1=-1;
      if(s1.length()!=s2.length())
        System.out.println("Given strings are not anagram");
      else{
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        for(int i=0;i<a1.length;i++)
          {
            for(int j=i+1;j<a2.length;j++)
              {
                char c;
                if(a1[i]>a1[j])
                {
                  c=a1[i];
                  a1[i]=a2[j];
                  a2[j]=c;
                }
              }
          }
        for(int i=0;i<a1.length;i++)
                        {
                      if(a1[i]!=a2[j])
                      {
                        c1=0;
                        break;
                      }
                      else continue;
                    }
      }
      if(c1==0)
      {
        System.out.println("Given strings are not anagram");
      }
      else
      {
        System.out.println("Given strings are anagram");
      }
    }
  }
  }
                          
              
  