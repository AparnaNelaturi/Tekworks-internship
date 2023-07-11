import java.util.Scanner;
class ArraySort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string 1 :");
      String s1=sc.nextLine();
      System.out.println("Enter the string 2 :");
      String s2=sc.nextLine();
      String str1=sorting(s1);
      String str2=sorting(s2);
      if(str1.equals(str2)
         System.out.println("given two strings are anagram");
   else
        System.out.println("given two strings are anagram");
}
 
String  sorting(String h)
{
char []g=h.toCharArray();
for (int i = 0; i < g.length-1; i++)  
{
for (int j = i + 1; j < g.length; j++)  
{
int temp ;
if (g[i] > g[j])  
{
temp = g[i];
g[i] = g[j];
g[j] = temp;
}
 
}
// convert character array into string
 
String s=new String(g);
 
/*
String s="";
for (int i = 0; i < g.length; i++)  
s=s+g[i]*/
 
return  s;
}
 
    }
  }
