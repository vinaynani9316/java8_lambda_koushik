package io.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

	public static void main(String[] args) 
	{
		List<Person> people = Arrays.asList(
				new Person("charles", "deck", 43),
				new Person("iahj", "dharun", 32),
				new Person("isha", "guptha", 30),
				new Person("vani", "kapoor", 29),
				new Person("hrithik", "roshan", 39)
				);
		
		people.stream()
		.filter(p->p.getLastName().startsWith("d"))  // it will check boolean through predicate interface
		.forEach(p-> System.out.println(p.getFirstName()));        // it will take one argument & return object of that argument.
		
		
		long count= people.stream()  // we can use parllelStream also that can activate methods simultaneously
		.filter(p->p.getLastName().startsWith("d"))
		.count();                                           //count is the terminal().
		System.out.println(count);

	}

}
