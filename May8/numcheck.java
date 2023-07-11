import java.util.*;
class NumCheck
  {
    public static void main(String[] args)
    {
      char ch;
      int option1;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number which you want to check :");
      int number=sc.nextInt();
      NumCheck obj=new NumCheck();
      System.out.println("1.To check positive");
      System.out.println("2.To check negative");
      System.out.println("3.To check even");
      System.out.println("4.To check odd");
      System.out.println("5.To check Prime");
      do{
        System.out.println("enter your choice");
        option1=s.nextInt();
        switch(option1)
          {
            case 1:obj.positive();
              break;
            case 2: obj.negative();
              break;
            case 3: obj.even();
              break;
            case 4: obj.odd();
              break;
            case 5: obj.prime();
            default: 
              System.out.println("invalid option");
          }
        System.out.println("do you want to continue one more operation");
        ch=s.next().charAt(0);
      }
        while(ch!='n');
    }
      void positive()
        {
        if(number>=0)
        {
          Systyem.out.println(number+"is a positive number");
        }
        }
      void negative()
        {
        if(number<0)
        {
          System.out.pritnln(number+"is a negative number");
        }
        }
      void even()
        {
        if(number%2==0)
        {
          System.out.println(number+"is an even number");
        }
        }
      void add()
        {
        if(number%2!=0)
        {
          System.out.println(number+"is an odd number");
        }
        }
      void prime()
        {
        int i,count=0;
        for(i=2;i<=number/2;i++)
          {
            if(number%i==0)
            {
              count++;
              break;
            }
          }
        if(count==0 && number!=1)
        {
          System.out.println(number+"is a Prime");
        }
        else{
          System.out.println(number+"not a prime");
        }
        }
      }
