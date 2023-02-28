//display values 0 1 1 2 3 5 8...n
import java.util.Scanner;
class Fibanocci
{
  public static void main(String args[])
  {
    int n1=0,n2=1;
    int n3,i,count=10;
    for(i=2;i<count;++i)
      {
        n3=n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
      }
  }
}