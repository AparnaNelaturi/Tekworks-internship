import java.util.Scanner;
class diagonalElements
  {
    public static void diagonal(int arr[][],int r,int c)
    {
      System.out.println("Diagonal elements in the matrix are :");
      for(int i=0;i<=r;i++)
        {
          for(int j=0;j<=c;j++)
            {
              if(i==j)
              {
                System.out.println(arr[i][j]);
              }
            }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter thre row size :");
      int row=sc.nextInt();
      System.out.println("Enter the column size :");
      int column=sc.nextInt();
      int array[][]=new int[row][column];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              array[i][j]=sc.nextInt();
            }
        }
      diagonal(array,row,column);
    }
  }