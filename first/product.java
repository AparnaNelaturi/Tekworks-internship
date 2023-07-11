import java.util.Scanner;
class product
{
   public static void main(String arg[])
        {
          String product_name;
          int MRP,selling_price;
Scanner p=new Scanner(System.in);
        System.out.println("enter product details");        
        product_name=p.next();
        MRP=p.nextInt();
        selling_price=MRP*10/100;
        System.out.println("selling_price is"+selling_price);
        }
}
