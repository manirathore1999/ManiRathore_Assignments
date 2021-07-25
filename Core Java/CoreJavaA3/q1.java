package CoreJavaA3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//import learn1.StateCompare;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> list=new TreeSet<>(new Sorted());
		list.add(new Person("Doss",160,98));
		list.add(new Person("Adam",158,98));
		list.add(new Person("Mark",158,98));
		list.add(new Person("Bob",155,86));
		list.add(new Person("Carl",160,86));
		//Iterator<Person> it=list.iterator();
		System.out.println(list);
		
		

}
}

class Person{
	String name;
	int weight;
	int height;
	
	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}

class Sorted implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getWeight()- o2.getWeight()==0) 
		{
			return o1.getHeight()-o2.getHeight();
		}else {
			return o1.getWeight()-o2.getWeight();
		}
	}
	
}

