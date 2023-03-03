import java.util.Scanner;
class Encryption
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=new String();
      System.out.println("Read some text to encrypt :");
      s1=sc.nextLine();
      System.out.println("Entre the position :");
      int position=sc.nextInt();
      String r=Encryptiontext(s1,position);
      System.out.println("message before Encryption :"+s1);
      System.out.println("message after Encryption :"+r);
    }
        public static String Encryptiontext(String s1,int position)
        {
          String result=" ";
          for(int i=0;i<s1.length();i++)
            {
              result=result+(char)(s1.charAt(i)+position%26);
            }
          return result;
        }
      }
    
  