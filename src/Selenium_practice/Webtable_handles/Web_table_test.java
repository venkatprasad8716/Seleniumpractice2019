package Selenium_practice.Webtable_handles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_test {

	 /*Webtable handle
	 *tr--> for rows
	 *td-->for columns
	 *th--> for headers*/

	 public static void main(String[] args)
	 {
	 String A_url = "https://techlistic.com/p/demo-selenium-practice.html";
	 String key ="webdriver.chrome.driver";
		String value = "G:\\\\java program\\\\eclipse examples\\\\Framework\\\\chromedriver_win32\\\\chromedriver.exe";
	 System.setProperty(key, value);
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.navigate().to(A_url);

	 //td[contains(@style,'border')])[2]
	 WebElement name = driver.findElement(By.xpath("(//td[contains(@style,'border')])[2]"));
	 String text = name.getText();
	 System.out.println(text);

	 //table[contains[@style,'box-sizing])/tbody/tr[2]/td[1]


	 List<WebElement> row = driver.findElements(By.xpath("//table[contains(@style,'box-sizing')]/tbody/tr"));
	 List<WebElement> column = driver.findElements(By.xpath("//table[contains(@style,'box-sizing')]/tbody/tr/th"));

	 for(int i=2; i<=row.size(); i++)
	 {
	 for(int j=1; j<=column.size(); j++)
	 {
	 WebElement web = driver.findElement(By.xpath("table[contains(@style,'box-sizing')]/tbody/tr["+i+"]/td["+j+"]"));
	 String ij = web.getText();
	 System.out.print(ij +"   ");
	 }
	 System.out.println("  ");
	 }
	 }
}

