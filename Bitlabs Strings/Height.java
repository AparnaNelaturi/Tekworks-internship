import java.util.*;
class Height
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of test cases");
    int n=sc.nextInt(); 
    displayHeight1(n);
  } 
  static void displayHeight(int n)
  {
    for (int i=0;i<n;i++)
    { 
      Scanner sc=new Scanner(System.in); 
      System.out.println("enter the height of x"); 
      String x=new String(sc.next());  
      System.out.println("enter the height of y"); 
      String y=new String(sc.next());
      int n1=Integer.parseInt(x);
      int n2=Integer.parseInt(y);
      if(n1>n2)
      {
        System.out.println("A");
      }
      else
        System.out.println("B");  
    }
  }
}