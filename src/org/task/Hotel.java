package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtMess = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
		String data = txtMess.getText();
		System.out.println(data);
		
	}

}
