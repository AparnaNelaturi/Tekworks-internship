import java.util.*;
class Lowertriangle
  {
    public static void lowerelements(int arr[][],int row,int column)
    {
  System.out.println("Display the lower values in a matrix:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              if(i>j)
              {
                continue;
              }
              else{
                System.out.print(arr[i][j]+" ");
              }
              System.out.println();
            }
        }
      
    }

public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
        System.out.print("enter the row size:");
      int row=s.nextInt();
      System.out.print("enter the coloumn size:");
      int column=s.nextInt();
      int array[][]=new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
     lowerelements(array,row,column);
    }
  } 