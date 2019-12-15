package io.java8;

public class TypeInferenceExmp {

	public static void main(String[] args) 
	{
		
//		lambda lam = s->s.length();
//		System.out.print(lam.mylambda("Hello Lambda"));
		printLambda(s->s.length());

	}
	
	public static void printLambda(lambda l)
	{
		System.out.println("hello lambda1");
	}
	
	interface lambda
	{
		int mylambda(String s);
	}

}
