package io.java8;

public class MethodReferenceExample1 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(MethodReferenceExample1::printMessage); // MethodReferenceExample1::printMessage , is exactly equal to
		t1.start();                                                  // ()->printMessage(); i.e, ()-> method() when having no arguments.
	}
	
	public static void printMessage()
	{
		System.out.println("Hello");
	}

}
