package Selenium_practice.Ln_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {
	public static void main(String[] args)
	{
		String E_url = "https://www.selenium.dev/";
		String key = "webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe"; 
		
		System.setProperty(key , value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(E_url);
		String A_url = driver.getCurrentUrl();
		System.out.println(A_url);
		if(E_url.equals(A_url))
		{
		System.out.println("statement is correct" + A_url);
		}
	else
		{
		System.out.println("Statement is wrong");
		}

	}

}

