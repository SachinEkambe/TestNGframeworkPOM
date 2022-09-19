package testNGproject;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount =5)
	public void TestMethod1()
	{
		System.out.println("Test Method1...");
	}
	@Test(invocationCount=2)
	public void TestMethod2()
	{
		System.out.println("Test Method2...");
	}

}
