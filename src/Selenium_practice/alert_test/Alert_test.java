package Selenium_practice.alert_test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_test {
	public static void main(String[] args) {
	String A_url = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	String key ="webdriver.chrome.driver";
	String value = "G:\\\\java program\\\\eclipse examples\\\\Framework\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty(key , value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(A_url);

		//driver.findelement(by.Xpath("");
		/*1.simple Alert
		*2.prompt alert
		*3.confirmation Alert*/

		/* by using few methods we can hanle alert.

		*1.void dismiss();

		*syntax:
		*driver.switch().alert().dismiss();
		 
		*2.void accept();
		*to click on ok we must give command accept

		*syntax:
		*driver.switch().alert().accept();


		*3.String gettext();
		*to capture the alert message

		*syntax:
		*driver.switch().alert().gettext();

		*4.String sendkeys();
		*to send some data to alert box

		*syntax:
		*driver.switch().alert().sendkeys("123");*/


		//simple alert
		driver.findElement(By.name("alert")).click();
		driver.switchTo().alert().accept(); //we can add dismiss als instead of accept

		//prompt alert
		driver.findElement(By.name("prompt")).click();
		Alert p = driver.switchTo().alert(); // here alert acts as datatype
		p.sendKeys("Aspire");
		System.out.println("test pass");
		p.accept();

		//get text
		driver.findElement(By.name("prompt")).click();
		Alert q = driver.switchTo().alert(); // here alert acts as datatype
		String text = q.getText();
		System.out.println(text);
		q.sendKeys("Aspire");
		System.out.println("test pass");
		q.accept();


		//confirmation box
		driver.findElement(By.name("confirmation Box"));
		driver.switchTo().alert().dismiss();

		//or
		// Alert dis = driver.switchTo().alert();
		// dis.dismiss();
	

}
}
