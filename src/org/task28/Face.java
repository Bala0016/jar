package org.task28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnLogin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnLogin.click();
		Thread.sleep(3000);
		List<WebElement> tRows = driver.findElements(By.xpath("//span[@class='_5k_3']"));
		int Si = tRows.size();
		System.out.println(Si);
		
			for (int i = 0; i < tRows.size(); i++) {
			WebElement tRow = tRows.get(i);
			  List<WebElement> tDatas = tRow.findElements(By.xpath("//label[@class='_58mt']"));
			   for (int j = 0; j < tDatas.size(); j++) {
				   WebElement tData = tDatas.get(j);
				   String text = tData.getText();
				   System.out.println(text);
				
			}
			
		}
	}

}
