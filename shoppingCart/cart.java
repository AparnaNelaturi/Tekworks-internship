import java.util.Scanner;
class cart
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      float totalCost=0;
      float cost;
      System.out.println("enter the product details :");
      System.out.println("enter the product cost :");
      do
        {
          cost=sc.nextInt();
        }
        while(n!=-1);
      if(totalCost>=0)
      {
        totalCost=totalCost+cost;
      }
      System.out.println("the total cost is :"+totalCost);
    }
  }