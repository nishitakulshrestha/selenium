package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public ChromeDriver d;
	public Properties pr;
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		File f=new File("../selenium_project_JUnit/ObjectRepo.properties");//est. the connection
		FileReader fr=new FileReader(f) ;
		pr=new Properties();
		pr.load(fr);
		d = new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		d.manage().window().maximize();
	}
	@AfterTest
	public void afterTest()
	{
		d.close();
	}

}
