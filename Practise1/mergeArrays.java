import java.util.Scanner;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of first array");
      n1=w.nextInt();
      int first[]=new int[n1];
      System.out.println("Give values for  first array");
      for(int i=0;i<n1;i++)
      first[i]=w.nextInt();
      Systyem.out.println("enter size of second array");
      n2=w.nextInt();
      int second[]=new int[n2];
      System.out.println("Give values for  second array");
      for(int i=0;i<n2;i++)
      second[i]=w.nextInt();
      int i1=0,i2=0;
      int finalarray[]=new int[n1+n2];
      int k=0;
      while(i1<first.length&&i2<second.length)
      {
        if(first[i1]<second[i2])
        {
          finalarray[k]=first[i1];
          k++;
          i1++
}
else
{
finalarray[k]=second[i2];
k++;
i2++
}
}
 
/* leftout element in first array*/
while(i1<first.length)
{
finalarray[k]=first[i1];
k++;
i1++;
}
 
/* leftout element in second array*/
 
while(i1<second.length)
{
finalarray[k]=second[i2];
k++;
i2++;
}
for(int l=0;l<finalarray.length;l++)
System.out.println(finalarray[l]);
}
  }

 
