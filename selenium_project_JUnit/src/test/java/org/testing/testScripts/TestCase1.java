package org.testing.testScripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;

public class TestCase1 extends Base
{
	@Test
	public void TC1() throws InterruptedException
	{
		//login
				WebElement signin= d.findElement(By.linkText(pr.getProperty("signin")));
				signin.click();
				WebElement email=d.findElement(By.id(pr.getProperty("email")));
				email.sendKeys("testing08.nk@gmail.com");
				WebElement next_button=d.findElement(By.xpath(pr.getProperty("next_button")));
				next_button.click();
				Thread.sleep(5000);
				WebElement pass=d.findElement(By.name(pr.getProperty("pass")));
				pass.sendKeys("Nkkul@123");
				WebElement pass_next=d.findElement(By.xpath(pr.getProperty("pass_next")));
				pass_next.click();
				Thread.sleep(5000);
				//click on trending
				WebElement guide_button=d.findElement(By.xpath(pr.getProperty("guide_button")));
				guide_button.click();
				WebElement Trending=d.findElement(By.linkText(pr.getProperty("Trending")));
				Trending.click();
				//logout
				WebElement avtr_button=d.findElement(By.xpath(pr.getProperty("avtr_button")));
				avtr_button.click();
				Thread.sleep(2000);
				WebElement log_out=d.findElement(By.xpath(pr.getProperty("log_out")));
				log_out.click();
	}
}