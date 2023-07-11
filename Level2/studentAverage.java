/*You are developing a program for a school that needs to calculate the average score of a student in a subject. The student's score is obtained by adding up the scores of multiple tests and dividing the sum by the number of tests taken. The program needs to prompt the student to enter the number of tests taken and their respective scores. The average score should be calculated and displayed.

Question: Write a Java program that asks the student to enter the number of tests taken. Use a loop to prompt the student for each test score and validate the input, ensuring that each score is a non-negative integer. If the input is invalid, display an error message and prompt the student to enter the value again. Once valid input is received for all test scores, calculate the average score and display the result.*/
import java.util.Scanner;
class Average
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no of subjects :");
      int noOfSubs=sc.nextInt();
      int i=1;
      while(i>=1 && i<=noOfSubs)
        {
          System.out.println("enter the first test score :");
          int test1=sc.nextInt();
          if(test1>=1 && test1<=100)
            int sum=0;
          sum=sum+
        }
      System.out.println("enter input in integer form only.");
    }
  }