package pagepkg;

import java.awt.print.PageFormat;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLDivElement;

public class Homepage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")WebElement products;
	@FindBy(tagName = "a")List<WebElement> links;
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement addtocart;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textmthd()
	{
		String actualtext = products.getText();
		return actualtext;
	}
	
	public int linkmthd()
	{
		int count = links.size();
		return count;
	}
	
	public void cartmthd()
	{
		addtocart.click();
	}
	
}
