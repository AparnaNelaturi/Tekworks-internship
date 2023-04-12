/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class Operations
  {
    public static void Operations1(int a,int b)
    {
      int sum=a+b;
      System.out.println("sum is :"+sum);
      int sum1=a-b;
      System.out.println("sum is :"+sum1);
      int sum2=a*b;
      System.out.println("sum is :"+sum2);
      int sum3=a/b;
      System.out.println("sum is :"+sum3);
      int sum4=a%b;
      System.out.println("sum is :"+sum4);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number :");
      int a=sc.nextInt();
      System.out.println("Enter the second number :");
      int b=sc.nextInt();
      Operations(a,b);
    }
  }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}