 package Frameworks;

import org.testng.annotations.Test;
//pull back by gitbash
public class Sample 
{
	@Test(priority =1)
	public void createContact()
	
	{
		System.out.println(" contact created ");
	}
	@Test(priority=2)
	public void modifyContact()
	{
		System.out.println("modified contact");
	}
	@Test(priority=3)
	public void deleteContact()
	{
		System.out.println("deleted contact");
	}
}
