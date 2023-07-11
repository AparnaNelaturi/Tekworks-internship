/* Write a java program to find the maximum occurring character in a given String */
import java.util.Scanner;
class test 
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // a b a a n c
    String str="abaacda";
    char[] ch=str.toCharArray();
     int count=1;
    int min=0;
    char ch1='z';
    for(int i=0;i<ch.length;i++){
      count=1;
      for(int j=i+1;j<ch.length;j++){
        if(ch[i]==ch[j]){
          count++;
        }
      }
      if(count>min){

        min=count;
        ch1=ch[i];
      }
    }
    System.out.println("maxmium occuring charater is "+ch1+" time of "+ min);

  }
}