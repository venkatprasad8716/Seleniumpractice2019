package Selenium_practice.Ln_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation_I implements Test_I{

	@Override
	public void openchrome() {
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


		


