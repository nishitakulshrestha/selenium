package org.testing.testScripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.Base;

public class TestCase2 extends Base
{
	@Test
	public void test_action() throws InterruptedException
	{
		//login
		WebElement signin= d.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement email=d.findElement(By.id("identifierId"));
		email.sendKeys("testing08.nk@gmail.com");
		WebElement next_button=d.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
		next_button.click();
		Thread.sleep(5000);
		WebElement pass=d.findElement(By.name("Passwd"));
		pass.sendKeys("Nkkul@123");
		WebElement pass_next=d.findElement(By.xpath("//div[@id='passwordNext']"));
		pass_next.click();
		Thread.sleep(5000);
		//click on history
		WebElement guide_button=d.findElement(By.xpath("//yt-icon-button[@id='guide-button']"));
		guide_button.click();
		Thread.sleep(5000);
		WebElement history=d.findElement(By.linkText("History"));
		history.click();
		Thread.sleep(1000);
		WebElement log_out_icon=d.findElement(By.xpath("//button[@id='avatar-btn']"));
		log_out_icon.click();
		Thread.sleep(2000);
		WebElement log_out=d.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		log_out.click();	
		
	}
	
}
