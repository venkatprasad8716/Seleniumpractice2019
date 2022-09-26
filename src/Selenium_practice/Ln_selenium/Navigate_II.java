package Selenium_practice.Ln_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_II implements Test_II{
public static void main(String[] args) throws InterruptedException {
	Navigate_II n = new Navigate_II();
	
n.opengoogle();
}
@Override
public void opengoogle() throws InterruptedException {

System.setProperty(key, value);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to(k_url);

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();
String title = driver.getTitle();
System.out.println(title);
if (E_tilte.equals(title) )
{
	System.out.println("matched");
}
else
{
	System.out.println("not matched");

}
driver.quit();
}
}
