//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
class Boolean
  {
    public static void BooleanOperation(Boolean s)
      {
        if(s.equals("True"))
        {
          System.out.println("False");
        }
        else{
          System.out.println("True");
        }
      }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter true/false :");
      Boolean s=sc.nextLine();
      BooleanOperation(s);
    }
  }