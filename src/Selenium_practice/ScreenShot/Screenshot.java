package Selenium_practice.ScreenShot;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException
	{
	String url = "https://www.amazon.in/";
	String key ="webdriver.chrome.driver";
	String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(url);
	
	
	Date d = new Date();
	System.out.print("Date" +d);
	TakesScreenshot screen =((TakesScreenshot)driver);
File actual = screen.getScreenshotAs(OutputType.FILE);
String path = "G:\\java\\screenshot\\"+d.toString().replace(":", " ")+"Amazon.png";
File destination = new File(path);
FileHandler.copy(actual, destination);


driver.quit();



	
}
}