package selenium_againIntro.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_JUnit {
	WebDriver driver;
	@Before
	public void before() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op=driver.manage();//return type of manage is - option so store it in option variable
		Window w=op.window();
		w.maximize();
		WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(5000);
	}
	@Test
	public void Signup()
	{
		WebElement new_firstname=driver.findElement(By.name("firstname"));
		new_firstname.sendKeys("ABC");
		WebElement new_lastname=driver.findElement(By.name("lastname"));
		new_lastname.sendKeys("DEF");
		WebElement new_mobile=driver.findElement(By.name("reg_email__"));
		new_mobile.sendKeys("567876556789");
		WebElement new_pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		new_pass.sendKeys("unknown");
		WebElement radio_male=driver.findElement(By.cssSelector("input[value='2']"));
		radio_male.click();
		WebElement drop=driver.findElement(By.id("day"));
		Select s=new Select(drop);
		s.selectByVisibleText("15");
		WebElement drop1=driver.findElement(By.id("month"));
		Select s1=new Select (drop1);
		s1.selectByIndex(2);
		WebElement drop2=driver.findElement(By.id("year"));
		Select s2=new Select(drop2);
		s2.selectByValue("2020");
	}
	@After
	public void after() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	

}
