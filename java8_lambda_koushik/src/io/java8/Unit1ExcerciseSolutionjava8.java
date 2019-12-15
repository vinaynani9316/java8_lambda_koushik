package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionjava8
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
		
		//step1 : sort list by last name
		
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//step2 : Create a method that prints all elements in the list 
		
		System.out.println("Print All");
		performConditionally(people, p-> true , p->  System.out.println(p));
		
		//step3 :  Create a method that prints all the people that have last name beginning with C
		
		System.out.println("Printing elements starts with last Name respectively");
		performConditionally(people, p -> p.getLastName().startsWith("d"), p-> System.out.println(p));
		
		// first name
		
		System.out.println("Printing elements starts with First Name respectively");
		performConditionally(people, p -> p.getFirstName().startsWith("i"), p->System.out.println(p.getFirstName())); 
		
		
		}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) 
	{
		System.out.println("******************");
     	for(Person p: people)
			if(predicate.test(p)) //with out creating external interface we can call Predicate interface for returning boolean using test method.
				consumer.accept(p); // Consumer class can accepts single object & returns single object
	
     }



}
