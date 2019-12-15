package io.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 
{
	public static void main(String[] args) 
	{
		List<Person> people = Arrays.asList(
				new Person("charles", "deck", 43),
				new Person("iahj", "dharun", 32),
				new Person("isha", "guptha", 30),
				new Person("vani", "kapoor", 29),
				new Person("hrithik", "roshan", 39)
				);
		                                                               //out is an instance reference,  System is static class & print is() 
		System.out.println("Print All");
		performConditionally(people, p-> true , System.out::println); // System.out::println is exactly equal to,
		                                                             //   p->  System.out.println(p) i.e, p->method(p) when having single()
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) 
	{
		System.out.println("******************");
     	for(Person p: people)
			if(predicate.test(p)) //with out creating external interface we can call Predicate interface for returning boolean using test method.
				consumer.accept(p); // Consumer class can accepts single object & returns single object
	
     }


}
