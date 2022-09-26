package Selenium_practice.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot_1 {
	public static void Screenshot_test(WebDriver driver) throws IOException
	{
		Date d = new Date();
		System.out.print("Date" +d);
		TakesScreenshot screen =((TakesScreenshot)driver);
	File actual = screen.getScreenshotAs(OutputType.FILE);  // here file acts as a data base
	String path = "G:\\java\\screenshot\\"+d.toString().replace(":", " ")+"Amazon.png";
	File destination = new File(path); // file acrs as class name
	FileHandler.copy(actual, destination);
	
	}
}
