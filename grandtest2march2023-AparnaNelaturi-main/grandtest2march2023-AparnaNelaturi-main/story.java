import java.util.Scanner;
class StoryFilling
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1="[noun] was really [adjective] today. We learned how to write[activity] today. I can't wait for tomorrow";
      String s2[]=s1.split(" ");
      String s3,s4,s5;
      s3=sc.nextLine();
      s4=sc.nextLine();
      s5=sc.nextLine();
      s2[0]=s3;
      s2[3]=s4;
      s2[10]=s5;
      for(int i=0;i<s2.length;i++)
        {
          System.out.println(s2[i]+" ");
        }
    }
  }