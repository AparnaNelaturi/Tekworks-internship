import java.util.*;
class stringexample
  {
    public static void main(String args[])
    {
      String string1=new String();
      String string2=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("give the data to the string1");
      string1=s.nextLine();
      System.out.println(string);
      //retrieving few characters
      System.out.println(string.charAt(3));
     System.out.println(string.charAt(1));
      //retrieving multiple words
       System.out.println(string.split("1"));
  String stringarray[]=string.split("1");
    for(int i=0;i<stringarray.length;i++)
      System.out.println(stringarray[i]);
//concatination method  
 System.out.println(string.concat("hello"));
 String s2="hai";
 System.out.println(string.concat(s2));     
System.out.println(string.concat(string));
      //string length
     System.out.println(string.length());
      int len=string.length();
       System.out.println(len);
      //+operator    
      System.out.println(string+"hello");
      System.out.println(string+s2);
      System.out.println(string+2);
      //to string
     System.out.println(string.toString());
      // char at
      System.out.println(string.charAt(6));
      //get char
      char p[]=new char[10]; 
      string.getChars(3,7,p,1);
      System.out.println(p);
      //bytes
     byte b[]=string.getBytes();
      for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
      //chararray
char sca[]=string.toChararray();

      //string comparison
      System.out.println("give the data for string2");
      string2=s.nextLine();
      String string2=new String(Scanner.nextLine);
System.out.println(string1.compareTo(string2));
      //equals to
      System.out.println(string1=string2);
      //starts with
      System.out.println(string1.startsWith("1"));
      System.out.println(string1.startsWith("ex"));
System.out.println(string1.endsWith("1"));
System.out.println(string1.endsWith("ex"));    
      System.out.println(string1.indexOf("llll"));
System.out.println(string1.indexOf("lllll"));
      System.out.println(string1.toLowerCase());
System.out.println(string1.toUpperCase())
;
   System.out.println(string1.substring(2))
;   
    System.out.println(string1.substring(2,3));
      System.out.println(string1.replace("e","77"));
    }
  }