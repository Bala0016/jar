package org.taskm1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fscreen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='leftD'])[4]"));
		File S = element.getScreenshotAs(OutputType.FILE);
		File D=new File("C:\\Users\\balam\\eclipse-workspace\\selenium25\\screenshot\\BALA.png");
		FileUtils.copyFile(S, D);
		
	}

}
