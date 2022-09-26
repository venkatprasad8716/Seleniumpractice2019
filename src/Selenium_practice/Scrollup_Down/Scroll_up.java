package Selenium_practice.Scrollup_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up {
	public static void main(String[] args) throws InterruptedException {
		String Aurl = "http://www.studionewwork.com/snw.html";
		String key ="webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
System.setProperty(key, value);
 WebDriver driver= new ChromeDriver();
//driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to(Aurl);

JavascriptExecutor j = ((JavascriptExecutor)driver);

// scroll up and down
// scroll up
j.executeScript("scroll(0, 1200)");
Thread.sleep(2000);
System.out.println("test pass for scroll down");
//scroll down
j.executeScript("scroll(0, -1200)");
System.out.println("test pass scroll up");

// scroll left and right
// scroll left
j.executeScript("scroll(500, 0)");
Thread.sleep(2000);
System.out.println("test pass scroll right");

j.executeScript("scroll(-500, 0)");
Thread.sleep(2000);
System.out.println("test pass scroll left");
}
}
