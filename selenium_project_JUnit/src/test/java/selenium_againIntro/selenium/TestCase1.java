package selenium_againIntro.selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCase1 {
	@Before
	public void before()
	{
		System.out.println("before");
	}
	@After
	public void closure()
	{
		System.out.println("After");
	}
	@Ignore
	@Test
	public void Test1()
	{
		System.out.println("Test1");
		
	}
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void Afterclass() {
		System.out.println("After class");
	}
}
