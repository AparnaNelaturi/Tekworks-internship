//toUpper and toLower
import java.util.*;
public class toUpperAndtoLower
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String ans = convertUpperToLower(str);
      System.out.println(ans);
    }
    public static String convertUpperToLower(String str)
    {
      char[] ch = str.toCharArray();
      for(int i=0 ; i<ch.length ; i++){
        if(ch[i]>= 'A'&& ch[i]<='Z'){
          ch[i] =(char)(int)(ch[i]+32);
        }
      }
      String ans = new String(ch);
      return ans;
    }
  }