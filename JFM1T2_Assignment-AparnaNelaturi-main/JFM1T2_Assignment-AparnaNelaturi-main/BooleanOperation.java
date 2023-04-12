/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class Boolean
  {
    public static void BooleanOperation(String x,String y)
    {
      if(x&&y==1)
      {
        System.out.println("x&&y is : true ");
      }
      else if(x||y == 1)
      {
        System.out.println("x||y is : true ");
      }
      else if(x!=1)
      {
        System.out.println("!x is : false ");
      }
      else if(y!=1)
      {
        System.out.println("!y is : true ");
      }
    }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of x(true/false)");
      String x=sc.nextLine();
      System.out.println("Enter the value of y(true/false)");
      String y=sc.nextLine();
      BooleanOperation(x,y);
    }
} 