package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnOver = driver.findElement(By.xpath("//span[@title='Overview']"));
		btnOver.click();
		
		Thread.sleep(3000);
		WebElement txtPara = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies')]"));
		String data = txtPara.getText();
		System.out.println(data);
	}

}
