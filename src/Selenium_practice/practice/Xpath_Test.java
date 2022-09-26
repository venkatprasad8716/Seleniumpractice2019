package Selenium_practice.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Test implements Xpath
{
	public static void main(String[] args) throws InterruptedException {
		Xpath_Test n = new Xpath_Test();
		n.openXpath();
	}

	@Override
	public void openXpath() throws InterruptedException {
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		//xpath method
	    /* two types of x path
	     * 1.absolute xpath-->rooth of the child is called absolute x path
	     * ex.HTML/BODY/DIV/LINK....
	     * 2.relative x path
	     */
		//absolute Xpath
		//driver.findElement(By.xpath(key))
	//Relative Xpath
		//syntax-->//tagname
	driver.findElement(By.xpath("//a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	//syntax-->//tagname[index]
	driver.navigate().to(url);
	driver.findElement(By.xpath("//a[2]")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	//syntax--> //tagname[@Attributename ='Attributevalue']
	driver.navigate().to(url);
	driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Venkat");
	Thread.sleep(20000);
	driver.navigate().back();
	
	//syntax--> //tagname[text()='textvalue']
	    driver.navigate().to(url);
		driver.findElement(By.xpath("//a[text() = 'Learn more']")).click();
		Thread.sleep(20000);
		driver.navigate().back();
		
		//syntax-->//tagname[contains(@Attribute,'Attributevalue')]
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_4_N1')]")).click();
		driver.navigate().back();
		
	//syntax-->//tagname[contains(text(),'textvalue')]
		    driver.navigate().to(url);
			driver.findElement(By.xpath("//a[contains(text(),'more')]")).click();
			Thread.sleep(20000);
			driver.navigate().back();
		
		
	
	
		
	}

}
