package Selenium_practice.Drag_Drop;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args)
	{
		String Aurl = "https://demo.guru99.com/test/drag_drop.html";
		String key ="webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(Aurl);
	
	
	 WebElement source = driver.findElement(By.xpath("(//li/a[@class='button button-orange'])[1]"));
	 WebElement target = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	 Actions a = new Actions(driver);
	 
	// a.clickAndHold(source).moveToElement(target).release().build().perform();
	a.dragAndDrop(source, target).perform();
	// System.out.println("test pass");
	// driver.quit();
}
}
