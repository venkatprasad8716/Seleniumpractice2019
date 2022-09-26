package Selenium_practice.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static void main(String[] args)
	{
String url ="https://www.flipkart.com/";
String key ="webdriver.chrome.driver";
String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";

System.setProperty(key, value);
WebDriver driver = new ChromeDriver();
driver.navigate().to(url);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
}
}