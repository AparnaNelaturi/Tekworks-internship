/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int sum=a+b;
      System.out.println("sum is :"sum);int sum=a+b;
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class Expression
  {
    public static void Expression1(int a,int b,int c,int d,int e)
    {
      b=a-- - --a;
      System.out.println("a-- - --a is :"+b);
      c=a--;
      System.out.println("a--"+c);
      d=a>>2;
      System.out.pritnln("a>>2 is :"+d);
      e=a&b;
      System.out.println("a&b is :"+e);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number1 :");
      int a=sc.nextInt(); 
      Sytsem.out.println("Enter the number2 :");
      int b=sc.nextInt();
      Expressions1(a,b);
    }
  }

//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
*/

//print appropriate result for Expression operators

}