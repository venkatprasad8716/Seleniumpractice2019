package Selenium_practice.synchronization_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_test {
	public static void main(String[] args) {
		

	String A_url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
			String key ="webdriver.chrome.driver";
	String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";

			System.setProperty(key, value);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			/*1.implicit wait (compile time polymorphism)
			*syntax:-
			*driver.manage().timeouts().implicitewait(timeout,timeunit.seconds);
			*(or)driver.manage().timeouts().implicitewait(duration.ofsecond(20), timeout.second));*/

			//driver.manage().timeouts().implicitewait(10 ,timeunit.seconds); //selenium 3
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //selenium 4
			driver.navigate().to(A_url);
			driver.findElement(By.id("sub-menu")).click();
}
}