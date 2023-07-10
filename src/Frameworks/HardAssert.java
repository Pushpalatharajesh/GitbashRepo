package Frameworks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void createCustomer()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		Assert.assertEquals(true, true);
		System.out.println("step4");
	}
	@Test
	public void mm1()
	{
		String expName="pushpa";
		String actualName="pushpalatha";
	    Assert.assertEquals(expName, actualName);
	}

}
