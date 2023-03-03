import java.util.Scanner;
class MobileNumber
  {
    public static String display(String s1)
    {
      int count=0;
      for(int i=0;i<=s1.length();i++)
      {
        if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
        {
          count++;
        }
      }
      if(count==10)
      {
        System.out.println("it is a valid mobile number");
      }
      else
      {
        System.out.println("it is not a valid mobile number");
      }   
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Give the data to s1 :");
    String s1=new String(sc.nextLine());
      display(s1);
    }
  }
  } 