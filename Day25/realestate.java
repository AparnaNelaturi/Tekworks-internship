import java.util.Scanner;
interface RealEstate
  {
    String getAddress();
    double getPrice();
    int getNumBedrooms();
    int getNumWashrooms();
  }
class House implements RealEstate
  {
    String Address;
    double Price;
    int NumBedrooms;
    int NumWashrooms;
    House(String Address,double Price,int NumBedrooms,int NumWashrooms)
    {
      this.Address=Address;
      this.Price=Price;
      this.NumBedrooms=NumBedrooms;
      this.NumWashrooms=NumWashrooms;
    }
    public String getAddress()
    {
      return Address;
    }
    public double getPrice()
    {
      return Price;
    }
    public int getNumBedrooms()
    {
      return NumBedrooms;
    }
    public int getNumWashrooms()
    {
      return NumWashrooms;
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the address :");
      String Address=sc.nextLine();
      System.out.println("Enter the price :");
      double Price=sc.nextInt();
      System.out.println("Enter the number of bedrooms:");
      int NumBedrooms=sc.nextInt();
      System.out.println("Enter the  number of washrooms :");
      int NumWashrooms=sc.nextInt();
      House house=new House("main street of sr nagar",578000,3,4);
      System.out.println(house.getAddress());
      System.out.println(house.getPrice());
      System.out.println(house.getNumBedrooms());
      System.out.println(house.getNumWashrooms());
    }
  }

  

