import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first string :");
      String s1=sc.nextLine();
      System.out.println("Enter second string :");
      String s2=sc.nextLine();
      Test t=new Test();
      t.Check();
      if(s1.compareTo(s2)==0)
      {
        System.out.println("both string are equal.");
      }
      else
        {
          System.out.println("both strings are not equal.");
        }
    }
    public void Check()
    {
      char []str1=s1.toCharArray();
      char []str2=s2.toCharArray();
      int len1=str1.length;
      int len2=str2.length;
      int count=0;
      if(len1==len2)
      {
        for(int i=0;i<len1;i++)
          {
            if(str1[i]==str2[i])
              count+=1;
          }
      }
      else
      {
        count=0;
      }
      if(count==len1)
      {
        System.out.println("the two strings are equal."+str1+"="+str2);
      }
      else
      {
        System.out.println("two strings are not equal.");
      }
    }
  }