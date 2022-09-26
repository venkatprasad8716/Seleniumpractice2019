package Selenium_practice.Drop_Down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {
	public static void main(String[] args) {
		String Aurl = "https://www.facebook.com/reg/";
		String key ="webdriver.chrome.driver";
		String value = "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe";
System.setProperty(key, value);
 WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to(Aurl);


WebElement b_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select  s= new Select (b_day);
s.selectByVisibleText("16");

//month
WebElement m_day = driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select m = new Select(m_day);
m.selectByIndex(2);

 List<WebElement> option = m.getOptions();
  int x = option.size();  //12
  
  for(int i=0; i<x; i++)
	 
  {
	String text = option.get(i).getText();
	System.out.println("list of months"+ text);
	 
  }

//year
WebElement y_day = driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select y = new Select(y_day);
y.selectByValue("1996");
	}
}
