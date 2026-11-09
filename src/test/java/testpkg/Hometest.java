package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Hometest extends Baseclass {

	@Test(priority = 1)
	public void textverify()
	{
		//loginobj.loginmthd("standard_user", "secret_sauce"); // if u want to test homepage individually first login the page
		
		String producttext = homepageobj.textmthd();
		Assert.assertEquals(producttext, "products");
	}
	
	@Test(priority = 2)
	public void linkverify()
	{
		int linkcount = homepageobj.linkmthd();
		System.out.println("number of links ------"+linkcount);
	}
	
	@Test(priority = 3)
	public void cartmthd()
	{
		homepageobj.cartmthd();
	}
}
