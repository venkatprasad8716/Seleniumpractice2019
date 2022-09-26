package Selenium_practice.gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium_practice.Ln_selenium.Test_I;

public class Tile_Test implements Test_I
{
	public static void main(String[] args)
	{
		Tile_Test t= new Tile_Test();
		t.openchrome();
		
	}

	@Override
	public void openchrome() {
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to(E_url);
	String title= driver.getTitle();
	System.out.println(title);
	
	if(ExpTitle.equals(title))
	{
		System.out.println("test is pass");
	}
	else
	{
		System.out.println("Test fail");
	}
	driver.quit();
	
	
		
	}

}
