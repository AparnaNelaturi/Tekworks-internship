import java.util.Scanner;
class Notes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while(n>=500)
        {
          n-=500;
          count++;
        }
      while(n>=200)
        {
          n-=200;
          count++;
        }
      while(n>=100)
        {
          n-=100;
          count++;
        }
      System.out.println(count);
    }
  }