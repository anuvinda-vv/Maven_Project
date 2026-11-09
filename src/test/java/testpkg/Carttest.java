package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Carttest extends Baseclass{

	@Test(priority = 1)
	public void cartclick()
	{
		//loginobj.loginmthd("standard_user", "secret_sauce"); // if u want to test homepage individually first login the page

		
		cartpageobj.cartbtnmthd();
	}
	
	@Test(priority = 2)
	public void textverification() 
	{
		String pagetext = cartpageobj.textmthd();
		Assert.assertEquals(pagetext, "yourcart");
	}
	
	@Test(priority = 3)
	public void checkoutclick()
	{
		cartpageobj.checkoutmthd();
	}
}
