package Selenium_practice.synchronization_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicite_wait_test {
public static void main(String[] args)
{
	//2.explicite wait(Run time polymorphism)
	/* it is used for some certain application(pages) that are not used commonly.
	*syntax:-
	*WebDriverwait w = new WebDriverwait(driver, timeout);
	*Webelement link;
	link = w.until(Expectedconditon.visibility of element located(by.Xpath).click();*/
	String A_url = "https://www.google.com/";
	String key ="webdriver.chrome.driver";
String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";

	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(A_url);
	driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
	WebDriverWait w = new WebDriverWait(driver ,Duration.ofSeconds(10));
	WebElement result = w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])/[1]")));
	


}
}
