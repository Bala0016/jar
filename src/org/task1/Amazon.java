package org.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtMess = driver.findElement(By.xpath("//a[contains(text(),'Con')]"));
		String data = txtMess.getText();
		System.out.println(data);
	}

}
