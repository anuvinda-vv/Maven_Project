package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"first-name\"]")WebElement firstname;
	@FindBy(xpath = "//*[@id=\"last-name\"]")WebElement lastname;
	@FindBy(xpath = "//*[@id=\"postal-code\"]")WebElement zip;
	@FindBy(xpath = "//*[@id=\"continue\"]")WebElement cntuebtn;
	
	public Checkoutpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void informationmthd(String fname,String lname, String pin)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zip.sendKeys(pin);
		cntuebtn.click();
	}
}
