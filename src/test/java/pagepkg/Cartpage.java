package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")WebElement cartbtn;
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")WebElement yourcart;
	@FindBy(xpath = "//*[@id=\"checkout\"]")WebElement checkout;
	
	public Cartpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cartbtnmthd()
	{
		cartbtn.click();
	}
	
	public String textmthd()
	{
		String actualtext = yourcart.getText();
		return actualtext;
	}
	
	public void checkoutmthd()
	{
		checkout.click();
	}
}
