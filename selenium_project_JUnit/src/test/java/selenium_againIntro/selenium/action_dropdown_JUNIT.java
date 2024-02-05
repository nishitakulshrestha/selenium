package selenium_againIntro.selenium;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action_dropdown_JUNIT {
	WebDriver driver;

	@Before
	public void before() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Options op=driver.manage();//return type of manage is - option so store it in option variable
		Window w=op.window();
		w.maximize();
		Thread.sleep(2000);
		
		
	}
	@Ignore
	@Test
	public void action_nonModifier() throws InterruptedException
	{
		Actions ac=new Actions(driver);
		for(int i=0;i<5;i++)
		{
			//pressing tab key 5 times on facebook signup page
			ac.sendKeys(Keys.TAB).perform();//for non modifier key
			Thread.sleep(2000);
			
		}
	}
	
	@Test
	//Test case -- open youtube, locate the video, then ctrl+click the video, video will 
	//open in new tab
	public void action_Moifier() throws InterruptedException
	{
		WebElement dd1=driver.findElement(By.id("fromCity"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.ARROW_DOWN).click(dd1).keyUp(Keys.ENTER).build().perform();
	}
	
}
