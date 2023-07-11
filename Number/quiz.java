import java.util.Scanner;
class quizGame
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      quizGame q=new quizGame();
      System.out.println("enter the student name :");
      String name=sc.nextLine();
      System.out.println("enter the no of quizes taken by the student :");
      int quizes=sc.nextInt();
      int quiz[]=new int[quizes];
      for(int i=0;i<quizes;i++)
        {
          System.out.println(i+1+"quiz marks are :");
          quiz[i]=sc.nextInt();
        }
      for(int i=0;i<=quizes-1;i++)
        {
          System.out.println(i+1+" quiz marks are : "+quiz[i]);
        }
      q.maximum(quiz,quizes,name);
      q.minimum(quiz,quizes,name);
      q.average(quiz,quizes,name);
    }
      void maximum(int quiz[],int quizes,String name)
        {
      int maxMarks=quiz[0];
      for(int i=0;i<quizes;i++)
        {
          if(quiz[i]>maxMarks)
          {
            maxMarks=quiz[i];
          }
        }
      System.out.println("maximum marks obtained by "+name+" among all quizes : "+maxMarks);
        }
      void minimum(int quiz[],int quizes,String name)
        {
      int minMarks=quiz[0];
      for(int i=0;i<quizes;i++)
        {
          if(minMarks>quiz[i])
          {
            minMarks=quiz[i];
          }
        }
      System.out.println("minimum marks obtained by "+name+" among all quizes is : "+minMarks);
      }
    void average(int quiz[],int quizes,String name)
    {
    int sum=0;
    for(int i=0;i<quizes;i++)
  {
    sum=sum+quiz[i];
  }
System.out.println("total marks obtained by "+name+" is : "+sum);
  }
  }
