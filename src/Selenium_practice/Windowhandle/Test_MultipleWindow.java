package Selenium_practice.Windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_MultipleWindow {

	public static void main(String[] args) {
		String Aurl = "https://nxtgenaiacademy.com/multiplewindows/";
		String key ="webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
System.setProperty(key, value);
 WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to(Aurl);


driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
driver.findElement(By.xpath("//button[@name='newmessagewindow321']")).click();
driver.findElement(By.xpath("//button[@name='newbrowsertab453']")).click();

//window handle is a key to check the 
String parent = driver.getWindowHandle();
System.out.println("Parent"+ parent);
Set<String> child = driver.getWindowHandles();
System.out.println("child"+child);

for(String c : child)
{
	if(parent.equalsIgnoreCase(c));
	driver.switchTo().window(c);
	driver.close();
}
	
driver.switchTo().window(parent);
driver.close();
	}
}