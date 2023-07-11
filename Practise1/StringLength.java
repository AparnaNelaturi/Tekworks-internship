import java.util.*;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String s=sc.nextLine();
      char []array=s.toCharArray();
      int count=0;
      for(int i=0;i<array.length;i++)
        {
          count+=1;
        }
      System.out.println("length of the string is :"+count);
    }
  }