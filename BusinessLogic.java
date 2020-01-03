package com.BusinessLogic;

import java.text.NumberFormat;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.PageObjects;

public class BusinessLogic extends PageObjects {
	
	WebDriver driver;
	
	public BusinessLogic(WebDriver webdriver)
	{
		
		driver = webdriver;
				
	}
	
	
	
	public void assignment1()
	{
		try
		{
			//finding price in amazon
			driver.findElement(By.xpath(AMZ_searchinput)).sendKeys("iPhone XR (64GB)-yellow");
			System.out.println(driver.findElement(By.xpath(AMZ_searchicon)).isDisplayed());
			driver.findElement(By.xpath(AMZ_searchicon)).click();
			String price1 = driver.findElement(By.xpath(iphoneprice_amazon)).getText().substring(1).replaceAll(",", "");
			System.out.println(price1);
			Double AMZ_price = Double.valueOf(price1);
			System.out.println(AMZ_price);
			
			//finding price in flipkart
			driver.navigate().to("https://www.flipkart.com");
			System.out.println(driver.getWindowHandles().size());
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			driver.findElement(By.xpath(FLP_search)).sendKeys("iPhone XR (64GB)-yellow");
			System.out.println(driver.findElement(By.xpath(FLP_searchicon)).isDisplayed());
			driver.findElement(By.xpath(FLP_searchicon)).click();
			String price2 = driver.findElement(By.xpath(iphoneprice_flip)).getText().substring(1).replaceAll(",", "");
			System.out.println(price2);
			Double FLP_price = Double.valueOf(price2);
			System.out.println(FLP_price);
			if(AMZ_price==FLP_price)
				System.out.println("Flipkart has same price of iphone when compared to Amazon");
			else if(AMZ_price>FLP_price)
				System.out.println("Flipkart has less price of iphone when compared to Amazon");
			else
				System.out.println("Amazon has less price of iphone when compared to Flipkart");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void assignment2()
	{
		try
		{
			System.out.println("ahgdf");
			driver.findElement(By.xpath(search)).click();
			driver.findElement(By.xpath(searchinput)).sendKeys("Club Mahindra");
			driver.findElement(By.xpath(searchBtn)).click();
			driver.findElement(By.xpath(firsthotel)).click();
			System.out.println(driver.getWindowHandles().size());
			Set<String> windows = driver.getWindowHandles();
			for(String win:windows)
				driver.switchTo().window(win);
			driver.findElement(By.xpath(writereviewBtn)).click();
			System.out.println(driver.getWindowHandles().size());
			Set<String> windows1 = driver.getWindowHandles();
			for(String win:windows1)
				driver.switchTo().window(win);
			System.out.println(driver.findElement(By.xpath(rating)).isDisplayed());
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath(rating)),52,0).click().perform();
			driver.findElement(By.xpath(reviewTitle)).sendKeys("Hotel");
			String text= "We enjoyed allot in madikeri rooms very need n clean... Food was tasty... Especially new celebration was really amazing.. Thank u for...e enjoyed allot in madikeri rooms very need n clean... Food was tasty... Especially new celebration was really amazing.. Thank u for...";
			driver.findElement(By.xpath(review)).sendKeys(text);
			driver.findElement(By.xpath(trip)).click();
			Select trav = new Select(driver.findElement(By.xpath(travel)));
			trav.selectByValue("1,2020");
			List<WebElement> hotel = driver.findElements(By.xpath(hotelrating));
			for(int i=0;i<hotel.size();i++)
			{
				actions.moveToElement(hotel.get(i),52,0).click().perform();
				
			}
			driver.findElement(By.xpath(certify)).click();
			driver.findElement(By.xpath(submit)).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}