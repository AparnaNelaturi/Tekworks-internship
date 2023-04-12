/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first value: 
    10
    Enter second value: 
    20
    
    Expected Output:
    a*=b is: 200
    a-=b is: 180
    a/=b is: 9
    a%=b is: 9
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class ShortHand
  {
    public static int ShortHandOperators(int x)
    {
      x+=4;
      System.out.println(x);
      x-=2;
      System.out.println(x);
      x*=7;
      System.out.println(x);
      x/=4;
      System.out.println(x);
      x%=4;
      System.out.println(x);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the value of x :");
      int x=sc.nextInt();
      ShortHandOperators(x);
    }
  }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first value: ");
  int a=sc.nextInt();
*/

//print appropriate result for assignment operators

}