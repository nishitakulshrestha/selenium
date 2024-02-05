//Activity 1- identify the web element
//Activity 2- perform action on that element
package maven_selenium.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp_TC2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));//Activity 1
		username.sendKeys("naina");//Activity 2
		/*WebElement password= driver.findElement(By.name("pass"));//Activity 1
		password.sendKeys("12345");//Activity 2
*/		//element locator using css selector
		WebElement password=driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("1234");
		WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
		//login.click(); to click login button
		
	
		//if want to hit some particular URL then linktext
		//FOR CREATE NEW ACCOUNT
		WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(5000);
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
	}}
		
		//#u_2_o_U0 > span:nth-child(2)
	