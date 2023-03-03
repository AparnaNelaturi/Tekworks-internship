import java.util.Scanner;
class StringBuffer1
  {
    public static void display(String s1)
    {
      StringBuffer sb=new StringBuffer(s1);
      System.out.println(sb.append("hello"));
      System.out.println(sb.delete(2,4));
      System.out.println(sb.insert(3,"wow"));
      System.out.println(sb.reverse());
      System.out.println(sb.replace(0,3,"hi"));
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Give the data to s1 :");
      String s1=new String(sc.nextLine());
      display(s1);
    }
  }
