 import java.util.Scanner;
class Betweentwo
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
      if(a>b)
      {
        System.out.println("a is greater"+a);
      }
      else
      {
        System.out.println("b is greater"+b);
      }
    }
  } 