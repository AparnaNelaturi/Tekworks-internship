if(d[i]==dish_name){
  try{
    throw new dishException("dish is already exists");
  }
      catch(dishException de)
    {
      System.out.println(de);
    }
    }
      else
    {
      System.out.println("dish is added");
    }
    }
  }
  
      void removeDish()
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the  dish to be removed:");
        String dish_name=s.next();
        for(int i=0;i<=d.length-1;i++)
          {
            if(d[i]!=dish_name)
            {
              try{
        throw new dishException("dish is already removed");
              }
            catch(dishException df)
              {
              System.out.println(df);
              }
            }
            else{
              System.out.println("dish is removed");
            }

              }
          }
      
    void getPrice()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the price:");
    
      try{
      price=s.nextInt();
      }
      catch(InputMismatchException id)
        {
        System.out.println("enter the valid price:");
        }
    }  
  }
  
class Restaurant
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number of dishes:");
      int num_dishes=s.nextInt();
    Dish d[]=new Dish[num_dishes];
      for(int i=0;i<=num_dishes-1;i++)
        {
          d[i]=new Dish();
         d[i].getName();
        d[i].getIngredients();
        d[i].addDish();
          d[i].removeDish();
        d[i].getPrice();
        }
  }
  }
