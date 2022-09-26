package Selenium_practice.Dimension_test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {
	public static void main(String[] args) {
		 String Aurl = "https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e";
			String key ="webdriver.chrome.driver";
			String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	 WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().deleteAllCookies();
	driver.navigate().to(Aurl);
	
	Dimension d1 = new Dimension(400 ,200);
	driver.manage().window().setSize(d1);
	
	Dimension d2 = new Dimension(400 ,200);
	driver.manage().window().setSize(d2);
	
	Dimension d3 = new Dimension(400 ,200);
	driver.manage().window().setSize(d3);
	
	Dimension d4 = new Dimension(400 ,200);
	driver.manage().window().setSize(d4);
	
	Dimension d5 = new Dimension(400 ,200);
	driver.manage().window().setSize(d5);
}
}
