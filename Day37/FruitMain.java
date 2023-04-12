import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Fruits {
	int price;
	double weight;
	public Fruits(int price, double weight) {
		super();
		this.price = price;
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
@Override
	public String toString() {
		return "Fruits [price=" + price + ", weight=" + weight + "]";
	}
}
public class FruitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruits> li=new ArrayList<>();
		li.add(new Fruits(10,12.34));
		li.add(new Fruits(13,15.34));
		li.add(new Fruits(12,11.34));
		li.add(new Fruits(19,10.34));
		//Collections.sort(li);
        for(Fruits l:li)
        	System.out.println(l.toString());
	}

}