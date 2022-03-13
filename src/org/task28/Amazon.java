package org.task28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone13");
		WebElement btnChh = driver.findElement(By.id("nav-search-submit-button"));
		btnChh.click();
		List<WebElement> tDatas = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int Si = tDatas.size();
		System.out.println(Si);
		for(WebElement tData:tDatas)
		{
			String text = tData.getText();
			System.out.println(text);
		}
		
	}

}
