import java.util.Scanner;
public class countdigits
  {
    public static void main(String args[])
    int num,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("\n Enter any number :");
    num= sc.nextInt();
while(num>0)  //for(:n>0:)
  {
    num=num/10;
    count=count+1;
  }
System.out.println("\n number og digits in the given number :");
  }
}