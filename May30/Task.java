import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String s=sc.nextLine();
      String array[]=s.split(" ");
      System.out.println(array[array.length-1].length());
      System.out.println(array[array.length/2].charAt(0));
    }
  }