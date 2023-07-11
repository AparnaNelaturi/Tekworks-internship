import java.util.*;
class CommonCharacters{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any String1 ");
    String str1=sc.nextLine();
    System.out.println("Enter any String2 ");
    String str2=sc.nextLine();
    displayCommonCharacters(str1,str2);
  }
  static void displayCommonCharacters(String str1, String str2){
   String str3="";
    char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    int i;
    for(i=0; i<ch1.length; i++){
      for(int j=0; j<ch2.length; j++){
        if(ch1[i]==ch2[j]){
          str3=str3+ch1[i];
          ch2[j]='0';
          break;
        }
      }
    }
    System.out.println(str3);
  }
}