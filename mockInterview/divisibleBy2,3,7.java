import java.util.*;
public class Divide
  {
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      ArrayList<Integer> l = new ArrayList<Integer>();
      System.out.println("enter the size of array list");
      int n = sc.nextInt();
      for(int i=0 ; i<=n-1;i++)
        {
          l.add(sc.nextInt());
        }
      System.out.println(l);

      Iterator itr = l.iterator();
      while(itr.hasNext())
        {
          int sum = 0;
          Integer val = (Integer) itr.next();
          if(val%2 == 0)
          {
            System.out.println(val);
          }else if(itr.hasNext())
          {
            for(int j=0;j<itr.size();j++)
            {
            sum = val + sum;
            }
            if(sum%3 == 0)
            {
              System.out.println(val);
            }
          }
          
          
        }
    }
  }