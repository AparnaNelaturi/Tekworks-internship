import java.util.*;
class ReverseString
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter String");
            String str=sc.next();
            char ch[]=str.toCharArray();
            for(int i=0;i<ch.length/2;i++)
                {
                    char temp=ch[i];
                    ch[i]=ch[ch.length-i-1];
                    ch[ch.length-i-1]=temp;
                }
            String rev=new String(ch);
            System.out.println(rev);
        }
    }