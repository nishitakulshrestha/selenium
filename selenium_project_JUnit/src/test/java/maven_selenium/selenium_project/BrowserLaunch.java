//29-07 Saturday
package maven_selenium.selenium_project;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");// launch the browser
		//driver.manage().window().maximize();
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
	}
	}