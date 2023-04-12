import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Product
  {
    String name;
    Double price;
    int quantity;
    Product(String name,double price,int quantity)
    {
      this.name=name;
      this.price=price;
      this.quantity=quantity;
    }
    String getName()
    {
      return name;
    }
    double getPrice()
    {
      return price;
    }
    int getQuantity()
    {
      return quantity;
    }
    void addQuantity(int quatity)
    {
      quantity+=quantity;
    }
    void removeQuantity(int quantity)
    {
      quantity-=quantity;
    }
  }
class ProductNotFoundException extends Exception
  {
    ProductNotFoundException(String message)
    {
      super(message);
    }
  }
class Store
  {
    List<Product>products=new ArrayList<>();
    void addProduct(Product product)
    {
      products.add(product);
    }
    void removeProduct(Product product)throws ProductNotFoundException
    {
      if(!products.remove(product))
      {
        throw new ProductNotFoundException("product"+product.getName()+"not found");
      }
    }
    void displayProducts()
    {
      System.out.println("products in the store are :");
      for(Product product :products)
        {
          System.out.println(product.getName()+"-"+product.getPrice()+"-"+product.getQuantity()+"units");
        }
    }
  }
class main
      {
        public static void main(String args[])
        {
          try
            {
              Product p1=new Product("Books",50,150);
              Product p2=new Product("Pens",10,100);
              Product p3=new Product("Pencils",30,550);
              Store store=new Store();
              store.addProduct(p1);
              store.addProduct(p2);
              store.addProduct(p3);
              store.displayProducts();
              p1.removeQuantity(10);
              p2.removeQuantity(15);
        }
      catch(Exception p)
        {
          System.out.println("Erroe occured :"+p.getMessage());
        }
    }
  }