import java.util.*;
public class upperLowerCase
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
      System.out.println(s1.concat(s2));

      int upperCase = 0;
      int lowerCase = 0;
      char[] ch = s1.toCharArray();
      for(char chh : ch)
        {
         if(chh >='A' && chh <='Z') 
         {
            upperCase++;
         } else if (chh >= 'a' && chh <= 'z')
         {
            lowerCase++;
         } else {
            continue;
         }
      }
      System.out.println("Uppercase " + upperCase + " and of Lowercase " + lowerCase);
   }
}