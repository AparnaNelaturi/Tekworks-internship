/*import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character :");
      char ch= sc.next().charAt(0);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
      {
        System.out.println(ch+"is a vowel");
      }
      else
      {
        System.out.println(ch+"is a consonant");
      }
    }
  }*/

import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character :");
      char ch=sc.next().charAt(0);
      if(ch=='a' || ch=='A')
      {
        System.out.println(ch+"is a vowel");
      }
      else if(ch=='e' || ch=='E')
      {
        System.out.println(ch+"is a vowel");
      }
      else if(ch=='i' || ch=='I')
      {
        System.out.println(ch+"is a vowel");
      }
      else if(ch=='o' || ch=='O')
      {
        System.out.println(ch+"is a vowel");
      }
      else if(ch=='u' || ch=='U')
      {
        System.out.println(ch+"is a vowel");
      }
      else
      {
        System.out.println(ch+"is a consonant");
      }
    }
  }