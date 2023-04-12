import java.util.Scanner;
class InvalidException extends Exception
  {
    InvalidException(String message)
    {
      super(message);
    }
  }
class StringValid
  {
    String text;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      text=sc.nextLine();
    }
    void validate()throws InvalidException
    {
      String words[]=text.split(" ");
      int len=words[0].length();
      int count=0;
      for(int i=0;i<words.length;i++)
        {
          if(words[i].length()==len)
          {
            count++;
          }
        }
      try{
            if(count==words.length)
            {
             System.out.println("valid words are detected");
            }
          else
          {
throw new InvalidException("Invalid word size detected");
          }
      }
      catch(InvalidException q){
        System.out.println(q.getMessage());
      }
    }
  }
  
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      StringValid w[]=new StringValid[4];
      for(int i=0;i<4;i++)
      {
      w[i]=new StringValid();
      w[i].add();
      try{
      w[i].validate();
      }
        catch(InvalidException e)
          {
            System.out.println(e);
          }
    }
  
    }
  }
  


    
  

      
