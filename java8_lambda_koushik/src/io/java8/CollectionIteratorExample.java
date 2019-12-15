package io.java8;

import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample {

	public static void main(String[] args)
	{
		List<Person> people = Arrays.asList(
				new Person("charles", "deck", 43),
				new Person("iahj", "dharun", 32),
				new Person("isha", "guptha", 30),
				new Person("vani", "kapoor", 29),
				new Person("hrithik", "roshan", 39)
				);
		
		System.out.println("Using external for Loop"); // this internal for loop runs at compile time
		for(int i=0; i<people.size(); i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("Using external forin Loop"); // advance for loop or for in loop runs at compile time
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		System.out.println("Using internal lambda forEach loop"); 
		people.forEach(System.out::println);           // forEach internal loop runs at run time.
	}                                                       // p->System.out.println(p) or System.out::println
	
	

}
