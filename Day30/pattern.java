import java.util.Scanner;
class InvalidException extends Exception
  {
    InvalidException(String message)
    {
      super(message);
    }
  }
class StringPattern
  {
    String text;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      text=sc.nextLine();
    }
    void Pattern()throws InvalidException
    {
      String words[]=text.split(" ");
      for(int i=0;i<words.length;i++)
        {
          String str=words[i];
          try{
            if(str.charAt(0)==str.charAt(words.length-1))
              System.out.println("pattern is available");
            else{
              throw new InvalidException("pattern is not available");
            }
          }
          catch(InvalidException e)
            {
              System.out.println(e.getMessage());
            }
        }
    }
  }
class main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      StringPattern sp[]=new StringPattern[4];
      for(int i=0;i<4;i++)
        {
      sp[i]=new StringPattern();
      sp[i].add();
          try{
      sp[i].Pattern();
    }
          catch(InvalidException e)
            {
              System.out.println(e.getMessage());
            }
  }
  }
  }