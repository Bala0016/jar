package org.taskm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtU = driver.findElement(By.id("username"));
		txtU.sendKeys("balavela");
		WebElement txtP= driver.findElement(By.id("password"));
		txtP.sendKeys("sehwag");
		WebElement btnL= driver.findElement(By.id("login"));
		btnL.click();
		
		
		WebElement SLo = driver.findElement(By.name("location"));
		Select select=new Select(SLo);
		select.selectByIndex(1);
		WebElement sH = driver.findElement(By.id("hotels"));
		Select select1=new Select(sH);
		select1.selectByIndex(2);
		WebElement sR = driver.findElement(By.name("room_type"));
		Select select2=new Select(sR);
		select2.selectByIndex(1);
		WebElement sN= driver.findElement(By.name("room_nos"));
		Select select3=new Select(sN);
		select3.selectByIndex(1);
		WebElement txtIn = driver.findElement(By.id("datepick_in"));
		txtIn.sendKeys("08/03/2022");
		WebElement txtOut= driver.findElement(By.id("datepick_out"));
		txtOut.sendKeys("10/03/2022");

		WebElement sA = driver.findElement(By.name("adult_room"));
		Select select4=new Select(sA);
		select4.selectByIndex(1);

		WebElement sC = driver.findElement(By.name("child_room"));
		Select select5=new Select(sC);
		select5.selectByIndex(1);
		WebElement btnS= driver.findElement(By.id("Submit"));
		btnS.click();
		WebElement btnR= driver.findElement(By.id("radiobutton_0"));
		btnR.click();
		WebElement btnC= driver.findElement(By.id("continue"));
		btnC.click();
		
		WebElement txtFir = driver.findElement(By.id("first_name"));
		txtFir.sendKeys("Bala");
		WebElement txtLas= driver.findElement(By.id("last_name"));
		txtLas.sendKeys("Murugan");
		WebElement txtAdd = driver.findElement(By.id("address"));
		txtAdd.sendKeys("79,vanniyar street,Dharmapuri");
		WebElement txtCC= driver.findElement(By.id("cc_num"));
		txtCC.sendKeys("1234567891234567");

		WebElement sTy = driver.findElement(By.name("cc_type"));
		Select select8=new Select(sTy);
		select8.selectByIndex(1);
		
		
		
		WebElement sCC = driver.findElement(By.id("cc_exp_month"));
		Select select6=new Select(sCC);
		select6.selectByIndex(1);
		WebElement sCA = driver.findElement(By.id("cc_exp_year"));
		Select select7=new Select(sCA);
		select7.selectByIndex(4);
		WebElement txtCVV= driver.findElement(By.id("cc_cvv"));
		txtCVV.sendKeys("123");
		WebElement btnBook= driver.findElement(By.id("book_now"));
		btnBook.click();
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		WebElement txtOrder= driver.findElement(By.id("order_no"));
		String attribute = txtOrder.getAttribute("value");
		System.out.println(attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
