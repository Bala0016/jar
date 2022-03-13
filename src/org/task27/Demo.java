package org.task27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	    WebElement Source = driver.findElement(By.id("credit2"));
	    WebElement Desi = driver.findElement(By.id("bank"));
	    Actions actions= new Actions(driver);
	    actions.dragAndDrop(Source, Desi).perform();
	    WebElement Sou = driver.findElement(By.id("fourth"));
	    WebElement Des = driver.findElement(By.id("amt7"));
	   
	    actions.dragAndDrop(Sou,Des).perform();
	    WebElement Sour = driver.findElement(By.id("credit1"));
	    WebElement De = driver.findElement(By.id("loan"));
	    actions.dragAndDrop(Sour, De).perform();
	    WebElement So= driver.findElement(By.id("fourth"));
	    WebElement D = driver.findElement(By.id("amt8"));
	    actions.dragAndDrop(So, D).perform();
	    WebElement txtData = driver.findElement(By.xpath("//a[@class='button button-green']"));
	    String text = txtData.getText();
	    System.out.println(text);
	   
	    
	    }

}
