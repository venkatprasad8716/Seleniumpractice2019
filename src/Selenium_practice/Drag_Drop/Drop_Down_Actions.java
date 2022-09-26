package Selenium_practice.Drag_Drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Down_Actions {
public static void main(String[] args)
{
	String Aurl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	String key ="webdriver.chrome.driver";
	String value = "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to(Aurl);
	
    WebElement parents = driver.findElement(By.id("sub-menu"));
    
    Actions a = new Actions(driver);
    a.moveToElement(parents).perform();
    
   List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
 int size = list.size();
  System.out.println(size);
  
  for(int i=0; i<size; i++)
  {
	 String text= list.get(i).getText();
	 System.out.println(text);
	  
  }
  for(int i=0; i<size; i++)
  {
	 String text= list.get(i).getText();
	 WebElement li = list.get(i);
	 System.out.println(text);
	 {
		 if (text.equalsIgnoreCase("google"))
		 {
			 li.click();
			 break;
		 }
	 }
  
		  }
	  }

}

