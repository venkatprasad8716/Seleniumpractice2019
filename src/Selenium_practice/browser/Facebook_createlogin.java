package Selenium_practice.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_createlogin {
	public static void main(String[] args) throws InterruptedException
	{
	String E_url = "https://www.facebook.com/r.php?locale=en_GB&display=page";
	String key ="webdriver.chrome.driver";
	String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key ,value);
	//open chrome browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(E_url);
	//id method
   WebElement sends = driver.findElement(By.id("u_0_b_zD"));
 boolean sen = sends.isDisplayed();
 if(sen ==true)
 {
	 sends.sendKeys("Aspire");
	 System.out.println("test is pass");
 }
	//name method
   Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("prasad");
	//classname method
    driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("8978779627");
    //tagname method
    driver.findElement(By.tagName("a")).click();
    driver.navigate().back();
    //linktext method*/
    driver.findElement(By.linkText("Already have an account?")).click();
    driver.navigate().back();
   //partial link text method
    driver.findElement(By.partialLinkText("Data Policy")).click();
}
}
