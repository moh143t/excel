

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {

	
	public WebDriver driver;
	String URL="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	
	public void launchbrowser()
	{
		driver=new FirefoxDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
