package Selenium_practice.broken_link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link_test {
public static void main(String[] args) throws IOException
{
	/* brokenlinks is it not used but asked in interviews
	*/
	String A_url = "https://www.amazon.in/";
	String key ="webdriver.chrome.driver";
	String value = "G:\\\\java program\\\\eclipse examples\\\\Framework\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(A_url);

	WebElement img = driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
	int x = img.getLocation().getX();
	int y = img.getLocation().getY();

	JavascriptExecutor j = ((JavascriptExecutor)driver);
	j.executeScript("window.scrollby("+x+","+y+")");

	List<WebElement> link = driver.findElements(By.xpath("//ul/li/a"));

	for(WebElement li  :link)
	{
	String ur = li.getAttribute("href");
	URL  u = new URL(ur);
	HttpURLConnection conn = (HttpURLConnection) u.openConnection();
	conn.connect();
	int res = conn.getResponseCode();

	if(res>400)
	{
	System.out.println("link is broken and its response code is " +res+" and its text is "+li.getText());
	}else
	{
	System.out.println("link is ok its response code is " +res+" and its text is "+li.getText());
	}
	}
	
	
}
}

