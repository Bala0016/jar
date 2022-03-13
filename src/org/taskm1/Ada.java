package org.taskm1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ada {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balam\\eclipse-workspace\\selenium25\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
		
		
		
		
		
		
		
		
	}

}
