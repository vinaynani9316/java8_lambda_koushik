package io.java8;

public class ThisReferenceExample 
{
	
	public void doProcess(int i, Process p)
	{
		p.process(i);
	}
	
	public void execute()
	{
		doProcess(10, i->{ 
			System.out.println("value of i is :" +i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) 
	{
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//		thisReferenceExample.doProcess(10, i-> {
//			System.out.println("value of i is :"+i);
//			//System.out.println(this); // this keyword won't work here so we are creating a execute ()
//		});
//		
		thisReferenceExample.execute();
       
	}
	
	public String toString()
	{
		return "this is the main ThisReference Example class instance";
	}

}
