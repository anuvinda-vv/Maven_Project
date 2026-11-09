package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Checkouttest extends Baseclass {

	@Test(priority = 1)
	public void inf0mthd()
	{
		//loginobj.loginmthd("standard_user", "secret_sauce"); // if u want to test homepage individually first login the page
		//cartpageobj.cartbtnmthd();
		//cartpageobj.checkoutmthd();
		
		checkoutpageobj.informationmthd("Anu", "ashok", "670335");
	}
	
}
