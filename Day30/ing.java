import java.util.Scanner;
class InvalidExcepiton extends Exception
  {
    InvalidExcepiton(String message)
    {
      super(message);
    }
  }
class StringCheck
  {
    String text;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      text=sc.nextLine();
    }
    void Check()
    {
      String words[]=text.split(" ");
      for(int i=0;i<words.length;i++)
        {
          try
            {
              if(words[i].endsWith("ing"))
              System.out.println("valid string");
          else
              {
                throw new InvalidExcepiton("the word "+words[i]+" doesn't ends with ing");
              }
            }
          catch(InvalidExcepiton k)
            {
            System.out.println(k.getMessage());
            }
        }
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      StringCheck s[]=new StringCheck[4];
      for(int i=0;i<4;i++)
      {
      s[i]=new StringCheck();
      s[i].add();
      s[i].Check();
       
    }
  
    }
  }
