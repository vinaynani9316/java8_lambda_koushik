package io.java8;

public class Greeter 
{
	public void greet(Greeting greeting) 
	{
		greeting.perform();
		
	}

	public static void main(String[] args)
	{
		Greeter greeter =new Greeter();
		HelloWorld helloworld= new HelloWorld();
		greeter.greet(helloworld);
		//helloworld.perform(); //java7
		
		Greeting innerAnonymous =new Greeting()  //java 8 is different java anonymous inner class is different
				{
			          public void perform()
			          {
			        	  System.out.println("Hello Vinay");
			          }
				};
				
				//innerAnonymous.perform();
				
		//java8 using single method in interface
		Greeting mylambdafunction = ()-> System.out.println("Hello java");
		//mylambdafunction.perform();
		
		greeter.greet(()-> System.out.println("using this program interface type inference"));
		greeter.greet(innerAnonymous);
		greeter.greet(mylambdafunction);
	}

}

//interface MyLambda  we can use Greeting interface
//{
//	void foo();
//}