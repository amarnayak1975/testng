package com.amar.AllTest;

import org.testng.TestNG;

public class CalculatorMain {

	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		
		System.out.println(c.add(12,3));
		System.out.println(c.sub(12,3));
		System.out.println(c.mul(12,3));
		System.out.println(c.div(12,3));
		TestNG testing=new TestNG();
		 testing.setTestClasses(new Class[] { NewTest.class });
		 testing.run();

	}

}
