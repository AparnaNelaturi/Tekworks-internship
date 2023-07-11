import java.util.Scanner;
class test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String []array=new String[]{"abc","bcd","def"};
      String []arr2=array.split(",");
    for(int i=0;i<array.length;i++)
      {
          if(arr2[i].length==2)
      System.out.println(array[i]);
    }
  }