import java.util.*;

class FruitMain implements Comparable<FruitMain>
{
	// Comparable-- comopareTo()
	// implement compareTo(Reference class on which we need to perform)
private int price;
double weight;

public FruitMain(int price, double weight) {
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
	return "FruitMain [price=" + price + ", weight=" + weight + "]";
}

public int compareTo(FruitMain fm)
{
	// return this.price - fm.price;
	
	if(this.price<fm.price)return 1;
	else
		if(this.price>fm.price)return -1;
		else return 0;
}
}

class FruitData
{
	public static void main(String arg[])
	{
		List<FruitMain> li=new ArrayList<>();
		li.add(new FruitMain(200,1.5));
		li.add(new FruitMain(150,0.5));
		li.add(new FruitMain(800,4));
		Collections.sort(li);
		
		
		for(FruitMain l : li)
			System.out.println(l.toString());
	}
}