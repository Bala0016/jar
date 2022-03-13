package org.taskm1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement btnLog = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnLog.click();
		Thread.sleep(3000);
		WebElement btnBox = driver.findElement(By.xpath("(//button[contains(text(),'click')])[3]"));
		btnBox.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("bala");
		al.accept();
		WebElement txtLe = driver.findElement(By.id("demo1"));
		String text = txtLe.getText();
		System.out.println(text);
	
	}

}
