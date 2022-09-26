package Selenium_practice.Ln_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_first {
public static void main(String[] args)
{
	//key-->Chrome-->Webdriver.chrome.driver
	//value-->path of chrome driver
	//set system property
	String E_url = "https://www.selenium.dev/";
	String key ="webdriver.chrome.driver";
	String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key , value);
	//open chrome browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(E_url);
	String A_url = driver.getCurrentUrl();
	System.out.println(A_url);
	if(E_url.equals(A_url))
	{
		System.out.println("both are matching" + A_url);
	}
	else
	{
		System.out.println("this is wrong");
	
	}
}
}
