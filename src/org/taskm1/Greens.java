package org.taskm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement btnReg = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	//	btnReg.click();
		WebElement txtEmail = driver.findElement(By.id("loginEmailId"));
		txtEmail.sendKeys("balamurugan.velaa@gmail.com");
		WebElement txtPass = driver.findElement(By.id("loginPassword"));
		txtPass.sendKeys("Sehwag@16");
		WebElement btnLog = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnLog.click();
		Thread.sleep(5000);
		WebElement btnSea = driver.findElement(By.xpath("//a[text()='See More']"));
		btnSea.click();
		WebElement btnIpho = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
		btnIpho.click();
		Thread.sleep(3000);
		WebElement btnCart = driver.findElement(By.xpath("(//a[@class='nav-link'])[8]"));
		btnCart.click();
		WebElement btnAdd = driver.findElement(By.xpath("//button[@class='btn btn-block btn-outline-primary btn-lg']"));
		btnAdd.click();
		Thread.sleep(3000);
		WebElement Doudle = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(Doudle).perform();
		
		WebElement Right = driver.findElement(By.xpath("//span[text()='×']"));
		Actions Actions=new Actions(driver);
		actions.contextClick(Right).perform();
		Thread.sleep(3000);
		WebElement btnRemove = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
		btnRemove.click();
	}
	

}
