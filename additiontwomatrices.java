import java.util.Scanner;
class Addition
  {
    public static void sum(int arr1[][],int arr2[][],int rows,int columns,int row1,int columns1)
    {
      System.out.println("The sum of two matrices are :");
      for(int i=0;i<rows;i++)
        {
          for(int j=0;j<columns;j++)
            {
              System.out.println("\t"+(arr1[i][j]+arr2[i][j]));
            }
          System.out.println("");
        }
    }
public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first matrix rows :");
  int rows=sc.nextInt();
  System.out.println("Enter the first matrix columns :");
  int columns=sc.nextInt();
    int arr1[][]=new int[rows][columns];
    System.out.println("enter the array elements");
  for(int i=0;i<rows;i++)
    {
      for(int j=0;j<columns;j++)
        {
          arr1[i][j]=sc.nextInt();
        }
    }
  System.out.println("Enter the second matrix rows :");
  int row1=sc.nextInt();
  System.out.println("Enter the second matrix columns :");
  int column1=sc.nextInt();
    int arr2[][]=new int[rows][columns];
    System.out.println("enter the array2 elements");
  for(int i=0;i<row1;i++)
    {
      for(int j=0;j<column1;j++)
        {
          arr2[i][j]=sc.nextInt();
        }
    }
   sum(arr1,arr2,rows,columns,row1,column1);
  }
}