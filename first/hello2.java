import java.util. Scanner;
class product
  {
    public static void main(String arg[])
    {
      String product_name;
      double MRP,selling_price;
      Scanner d=new Scanner(System.in);
      product_name=d.next().charAt(0);
      MRP=d.nextDouble();
      selling_price=d.nextDouble();
      selling_price=MRP*10/100;
      System.out.print("selling_price is"+selling_price);
    }
  }