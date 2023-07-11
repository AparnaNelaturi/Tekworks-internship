import java.util.Scanner;
class test
  {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int [ ] dedo = { 1, 3, 6, 9, 2, 5, 7};
      int que = dedo[0];
      for (int k = 0; k < dedo.length; k++)
      {
          if (dedo[k] < que)
             que = dedo[k];
      }
      System.out.print(que);
  }
  }