//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;
class Circle
  {
    public static void  Circle1(int radius,int pie) 
    { 
		//Calculating the area of the circle
		float area=2*pie*radius;
		
		// Printing the floating point area value
		System.out.println("Area of circle = "+ area);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the valur of radius :");
      int radius =sc.nextInt();
      Circle1(radius, pie) ;
		// Casting the floating point area value to the int value
      int newarea=(int)area;
		
		// Printing the casted area value from float to int 
		System.out.println("Area of circle = "+ newarea);
}