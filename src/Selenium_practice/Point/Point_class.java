package Selenium_practice.Point;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Point_class {
	public static void main(String[] args) {
		 String Aurl = "https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e";
			String key ="webdriver.chrome.driver";
			String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	 WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(Aurl);
	
	Point p1 = new Point(200,50);
	driver.manage().window().setPosition(p1);
	
	Point p2 = new Point(210,50);
	driver.manage().window().setPosition(p2);
	
	Point p3 = new Point(220,50);
	driver.manage().window().setPosition(p3);
	
	Point p4 = new Point(230,50);
	driver.manage().window().setPosition(p4);
	
	Point p5 = new Point(240,50);
	driver.manage().window().setPosition(p5);
	}
}