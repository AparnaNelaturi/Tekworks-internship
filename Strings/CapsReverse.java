//input   : welcome to the tekworks
// output : WELCOME ot THE skrowket
/*import java.util.Scanner;
class even
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string :");
      String s=sc.nextLine();
      String words[]=s.split("");
      String Final=" ";
      for(int i=0;i<words.length;i++)
        {
          String word=words[i];
          String capital=" ";
          if(i%2==0)
          {
          for(int j=0;j<word.length()-1;j++)
            {
              capital=capital+word.toUpperCase();
            }
          }
          else
          {
            String reverse=" ";
            for(int k=word.length()-1;k>=0;k--)
              {
                reverse=reverse+word.charAt(i);
              }
          }
          Final+=word.charAt(i);
        }
      System.out.println("the finalized string is :");
      for(int i=0;i<Final.length();i++)
        {
          System.out.println(Final.charAt(i));
        }
    }
  } */
/*Write a java program to modify the following pattren:
even words to uppercase and reverse the odd words.*/
// input: java is very easy
// output: JAVA si VERY ysae

import java.util.*;
class EvenUppOddRev
  {
    public static void main(String...arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Please give data to string");
      String s=sc.nextLine();

      String str[]=s.split(" ");
      String rev="";
      String output="";
      for(int i=0;i<str.length;i++)
        {
          String word=str[i];
          if(i%2==0)
          {
            output=word.toUpperCase();
          }
          else 
          {
            rev="";
            for(int j=word.length()-1;j>=0;j--)
              {
                rev+=word.charAt(j);
              }
            output=rev;
          }
          System.out.print(output+ " ");
        }
      System.out.println(" ");
      
    }
  }