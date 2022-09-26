package Selenium_practice.gen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium_practice.Ln_selenium.Test_I;

public class Navigate_test implements Test_I{
private static final String Exptitle = null;
public static void main(String[] args) throws InterruptedException
{
Navigate_test n = new Navigate_test();
n.openchrome();
}
@Override
	public void openchrome() throws InterruptedException {
System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(E_url);
	Thread.sleep(20000);          // to slow down the process of opening
	driver.navigate().back();
	Thread.sleep(20000);    
	driver.navigate().forward();
	Thread.sleep(20000);    
	driver.navigate().refresh();
	String title = driver.getTitle();
	System.out.println(title);
	if (Exptitle.equals(title))
	{
		System.out.println("matched");
	}
	else
	{
		System.out.println("not matched");

	}
	driver.quit();
	}
	}
	
	

