package org.task27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement lnkCourse = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkCourse).perform();
		WebElement lnkPhone = driver.findElement(By.xpath("//span[text()='5G phones']"));
		lnkPhone.click();
		Thread.sleep(3000);
		WebElement txtDo = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		String text = txtDo.getText();
		System.out.println(text);
	
	}

}
