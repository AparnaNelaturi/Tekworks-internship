import java.util.Scanner;
class Frequency
  {
    public static display frequency(int i,int j,int freq[])
    {
      int[] freq=new int[str.length()];
      int i,j;
      char string[]=str.toCharArray();
      for(i=0;i<str.length();i++)
        {
          freq[i]=1;
          for(j=i+1;j<str.length();j++)
            {
              if(string[i]==string[j])
              {
                freq[i]++;
                string[j]=0;
              }
            }
        }
      System.out.println("characters and the frequency :");
      for(i=0;i<freq.length;i++)
        {
          if(string[i]!=' ')
            System.out.println(string[i]+" "+freq[i]);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String str=new String(sc.nextLine());
      frequency(freq,i,j);
    }
  }