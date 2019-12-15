package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava7 
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
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLastName().compareTo(o2.getLastName());
			} 
			
		});
		
		//step2 : Create a method that prints all elements in the list 
		
		System.out.println("Print All");
		printAll(people);
		
		//step3 :  Create a method that prints all the people that have last name beginning with C
		
		System.out.println("Printing elements starts with last Name respectively");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("d");
			}
			
		});
		
		// first name
		
		System.out.println("Printing elements starts with First Name respectively");
		printConditionally(people, new Condition() {
			
			public boolean test(Person p)
			{
				return p.getFirstName().startsWith("i");
			}
		});
		
		
		}
	
	private static void printConditionally(List<Person> people, Condition condition) 
	{
		System.out.println("******************");
     	for(Person p: people)
			if(condition.test(p))
				System.out.println(p);
	
     }

	
	private static void printAll(List<Person> people) 
	{
		System.out.println("******************");
		for(Person p: people)
			System.out.println(p);
	}

}
interface Condition
{
	boolean test(Person p);
}