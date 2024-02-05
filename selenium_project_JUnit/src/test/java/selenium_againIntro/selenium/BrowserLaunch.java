package selenium_againIntro.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op=driver.manage();//return type of manage is - option so store it in option variable
		Window w=op.window();
		w.maximize();
	}
	@After
	public void after()
	{
		driver.close();
	}
	@Test
	public void tc() throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("email"));//Activity 1
		username.sendKeys("naina");
		Thread.sleep(9000);
}
}
