import java.util.*;
public class Captalize
  {  
public static void main(String[] args) 
    {  
      Scanner sc=new Scanner(System.in);
      String s1=new String();
      String s2=new String();
      System.out.println("give the data to s1");
      s1=sc.nextLine();       
      System.out.println("give the data to s2");
      s2=sc.nextLine();
      System.out.println(s1.captalizeword("given data"));
      System.out.println(s2.captalizeword("given data an string"));   
    }  
}