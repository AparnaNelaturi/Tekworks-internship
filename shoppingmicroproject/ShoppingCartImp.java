//Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.
import java.util.*;
class ShoppingCartImp implements ShoppingCartInterface
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ShoppingCartData> al=new ArrayList<>();
        public void add()
        {
            System.out.println("Enter no of items to add");
            String x1 = sc.nextLine();
            int x = Integer.parseInt(x1);
            for (int i = 0; i < x; i++) 
             {
               System.out.println("Enter item names to add ");
               String item = sc.nextLine();
               System.out.println("Enter price of item");
                String p=sc.next();
                 double price=Double.parseDouble(p);
               al.add(new ShoppingCartData(item,price));
             }
        }
        
        public void remove()
        {
            if (al.size() == 0)
      System.out.println("No Items are Available to Delete");
    else {
      String verify = null;
      System.out.println("Enter Item name to Delete ");
      String item = sc.nextLine();
      for (ShoppingCartData e : al) {
        if (e.getItem().equals(item)) {
          al.remove(e);
          verify = "found";
          break;
        }
      }
      if (verify == null) {
        System.out.println("Not Found");
      }
    }
    }
        public void displayItems()
        {
            Iterator itr=al.iterator();
            while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }
        }
        public void totalCost()
        {
            double totalPrice=0;
            for (ShoppingCartData e : al) 
                totalPrice=totalPrice+e.getPrice();
            System.out.println(totalPrice);
    }
    }
