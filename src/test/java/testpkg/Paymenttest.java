package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Paymenttest extends Baseclass {

	@Test(priority = 1)
	public void scrnshotmethod() throws Exception
	{
		
		paymentpageobj.scrnshotmthd();
	}
	
	@Test(priority = 2)
	public void finishbtn()
	{
		paymentpageobj.finishmthd();
	}
	
}
