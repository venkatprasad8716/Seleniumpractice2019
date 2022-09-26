package Selenium_practice.synchronization_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent_test {
public static void main(String[] args)
{
	/*fluent
	*syntax:
	*wait w = new fluentwait(Webdriver reference)
	*w.withtimeout (timeout , second);
	*id.polling every (timeout, seconds);
	*w.ignoring(exception.class);*/
	String A_url =  "https://www.google.com/";
	String key ="webdriver.chrome.driver";
	String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(A_url);

	Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(10))
	.ignoring(NoSuchElementException.class);
	w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])/[1]")));



}
}
