package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyfail {
	@Test()
	public void signup()
	{
		System.out.println("Hi i am sign up");
	}
	
	@Test(dependsOnMethods="signup")
	public void login()
	{
		Assert.fail();
		System.out.println("Hi i am login");
	}
	@Test(dependsOnMethods={"signup","login"})
	public void cart()
	{
		System.out.println("Hi i am cart");
	}
	@Test(dependsOnMethods={"signup","login"})
	public void logout()
	{
		System.out.println("Hi i am logout");
	}

}
