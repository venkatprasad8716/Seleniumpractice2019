package Selenium_practice.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// this iframe is to find the link inside link by click on image pattern here link located inside image so we  
public class Iframe_Test {
public static void main(String[] args) throws InterruptedException {
	String Aurl = "https:demo.guru99.com/test/guru99home/";
	String key ="webdriver.chrome.driver";
	String value = "G:\\java program\\eclipse examples\\Framework\\chromedriver_win32\\chromedriver.exe";
System.setProperty(key, value);
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to(Aurl);
// we should call Xpath of its parent
WebElement img =driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
int x = img.getLocation().getX();
int y = img.getLocation().getY();


JavascriptExecutor e =((JavascriptExecutor)driver);
e.executeScript("scroll("+x+","+y+")");
driver.switchTo().frame(img);
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
}
}
