package Selenium_practice.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Advance_Xpath_test extends Advance_Xpath {

	public static void main(String[] args) throws IOException, InterruptedException
	{
			
			System.setProperty(key, value);
			 driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(Aurl);
			
			
		
			Advance_Xpath_test X = new Advance_Xpath_test();
			X.textbox_test();
			X.mobile_test();
			X.fashion_test();
			X.electronic_test();
			X.best_test();
			
			X.logo_test();
			driver.quit();
		
		}
		
	}

