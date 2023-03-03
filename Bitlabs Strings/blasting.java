import java.util.Scanner;
class RemoverPattern
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to s1 :");
      String s1=new String(sc.nextLine());
      System.out.println("Enter the value of W :");
      int W=sc.nextInt();
    }
    public static void Remover()
    {
      while(s[i])
        {
          if(s[i]!=s[i+1])
          {
            res=res+s[i];
            i++;
            if(s[i+1]!='\0' &&  s[i]==s[i+1])
            {
              while(s[i+1]!='\0' &&  s[i]==s[i+1])
                i++;
            }
          }
        }
    }
  }