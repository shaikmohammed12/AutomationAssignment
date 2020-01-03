package Test.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BusinessLogic.BusinessLogic;

public class Assignment2 {
	
	WebDriver driver;
	BusinessLogic bussi;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/home/sakha-shaik/eclipse-workspace/Test/src/test/driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in");
		//driver.manage().window().maximize();
		driver.navigate().refresh();
		bussi = new BusinessLogic(driver);
		
	}
	
	@Test
	public void test()
	{
		try {
		bussi.assignment2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
