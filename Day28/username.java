import java.util.Scanner;
class InvalidUsernameException extends Exception
  {
    String username;
    InvalidUsernameException(String username)
    {
      super(username);
    }
    String getUsername()
    {
      return username;
    }
   
  }
class UsernameValidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String username;
      UsernameValidation u=new UsernameValidation();
      boolean isValid=false;
      while(!isValid)
        {
          System.out.println("Enter the username :");
          username=sc.nextLine();
          try
            {
            u.checkUsername(username);
            isValid=true;
            System.out.println("valid username :"+username);
          }
          catch(InvalidUsernameException e)
            {
              System.out.println("invalid username :"+e.getUsername());
            }
        }
    }
      void checkUsername(String username) throws InvalidUsernameException
    {
      for(int i=0;i<username.length();i++)
        {
          char c=username.charAt(i);
          if(c<='a' || c>='z' || c<='A' || c>='Z' || c<='0' || c>='9')
          {
            throw new InvalidUsernameException("Invalid username"+username);
          }
          else
          {
            
          }
        }
   }
  }
   