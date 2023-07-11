import java.util.Scanner;
class test
{
  void method(int a,int b)
  {
    System.out.println(a+b);
  }
 double method(int a,double b)
  {
    System.out.println(a+b);
  }
}
class Main
{
  public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
    test t=new test();
    t.method(1,2);
t.method(5,23.5);
  }
}
