package compareExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Person other) {
		int nameComparision=this.name.compareTo(other.name);
	     return nameComparision;	
	}
	
}
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person>p=new ArrayList<>();
		p.add(new Person("mohan",20));
		p.add(new Person("vinay",21));
		p.add(new Person("taj",22));
		Collections.sort(p);
		for(Person h:p)
			System.out.println(h);
	}

}