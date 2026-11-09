package basepkg;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Cartpage;
import pagepkg.Checkoutpage;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Paymentpage;

public class Baseclass {

public static WebDriver driver;
	
	public Loginpage loginobj;
	public Homepage homepageobj;
	public Cartpage cartpageobj;
	public Checkoutpage checkoutpageobj;
	public Paymentpage paymentpageobj;
	
	
	@BeforeTest
	public void setup()
	{
		//open in incognito to manage browser popup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void objectmethod()
	{
		loginobj = new Loginpage(driver);
		homepageobj = new Homepage(driver);
		cartpageobj = new Cartpage(driver);
		checkoutpageobj = new Checkoutpage(driver);
		paymentpageobj = new Paymentpage(driver);
	}
}
