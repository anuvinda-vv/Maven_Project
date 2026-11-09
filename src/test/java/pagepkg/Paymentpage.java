package pagepkg;

import java.io.File;
import java.io.IOException;
import java.net.http.WebSocket;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Paymentpage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"finish\"]")WebElement finishbtn;
	
	public Paymentpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scrnshotmthd() throws Exception 
	{
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("./screenshot/ss.png"));
	}
	
	public void finishmthd()
	{
		finishbtn.click();
	}
}
