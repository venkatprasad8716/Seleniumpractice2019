package Selenium_practice.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_browser {

	public static void main(String[] args) {
		
		String E_url = "https://www.facebook.com/";
		String key ="webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key , value);
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(E_url);
		driver.findElement(By.id("email")).sendKeys("venkat.prasad.315");
		//driver.findElement
		driver.findElement(By.name("pass")).sendKeys("Pandu@8716");
		driver.findElement(By.id("u_0_5_+V")).click();
		
				}
	}
