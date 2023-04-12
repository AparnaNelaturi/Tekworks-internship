import java.util.Scanner;
interface StackArrayInterface
  {
    void push();
    void pop();
    void peek();
    void display();
    void exit();
  }
class StackArray implements StackArrayInterface
  {
    Scanner sc=new Scanner(System.in);
    int top;
    int maxSize=15;
    int[]arr=new int[maxsize];
    StackArray(int top,int maxSize,int[]arr)
    {
      super();
      this.top=top;
      this.maxSize=maxSize;
    }
    void push()
    {
      if(top==maxSize-1)
      {
        System.out.println("Overflow");
      }
      else{
        System.out.println("Enter value :");
        int value=sc.nextInt();
        top++;
        arr[top]=value;
        System.out.println("value is pushed into the stack.");
      }
    }
    void pop()
    {
      if(top!=-1){
        top--;
        System.out.println("value is popped.");
      }
       else
      {
        System.out.println("Underflow");
      }
    }
    void peek()
    {
      System.out.println("peek element is"+top);
    }
    void display()
    {
      System.out.println("Stack elements are :");
      for(int i=top;i>=0;i--)
        {
          System.out.println(arr[i]);
        }
    }
    void exit()
    {
      System.out.println("Ended");
    }
  }
class StackOperations
  {
    public static void main(String args[])
    {
      int choice=0;
      Scanner sc=new Scanner(System.in);
      StackArray sa=new StackArray();
      System.out.println("we applied some stack operations using array ");
      while(choice!=5)
        {
          System.out.println("choose the option which you want to perform : 1.push 2.pop 3.display 4.exit");
          choice=sc.nextInt();
          switch(choice)
            {
              case 1:
                {
                  sa.push();
                  break;
                }
              case 2:
                {
                  sa.pop();
                  break;
                }
              case 3:
                {
                  sa.peek();
                }
              case 4:
                {
                  System.out.println("Stack Array elements are :");
                  sa.display();
                }
              case 5:
                {
                  System.out.println("Ended");
                }
              default:
                {
                  System.out.println("please enter a valid choice");
                }
            }
        }
    }
  }