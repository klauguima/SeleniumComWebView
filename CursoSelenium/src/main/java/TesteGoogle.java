import java.awt.Dimension;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
	
	@Test
	public void teste(){
//		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/IEDriverServer.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().setPosition(new Point(100, 100));
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
	}

}
