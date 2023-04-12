import java.util.*;
class ShoppingCartData
    {
        String item;
        double price;
        ShoppingCartData(String item,double price)
        {
            this.item=item;
            this.price=price;
        }
		public String getItem() {
			return item;
		}
		public double getPrice() {
			return price;
		}
	    public String toString()
        {
            return "ShoppingCart [item name=" + item + " price=" + price + "]";
        }
    }
