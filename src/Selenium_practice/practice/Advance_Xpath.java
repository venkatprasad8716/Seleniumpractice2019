package Selenium_practice.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Advance_Xpath implements Advance_Xpath_interface
{
	static WebDriver driver;
	
	

	@Override
	public void textbox_test() throws IOException 
	{
		// parent to child
				WebElement textbox = driver.findElement(By.xpath(t_url));
				boolean text = textbox.isDisplayed();
				
				if(text== true)
					
				{
					textbox.sendKeys("mobile");
					Screen_shot_1.Screenshot_test(driver);
					System.out.println("test is pass");
				}
	}

	@Override
	public void mobile_test() throws IOException 
	{
		//self node 
				//syntax-->//tagname[text()='textbox']/self::tagname   we can use attribute name or any thing
				WebElement mobile = driver.findElement(By.xpath(m_url));
				boolean mob = mobile.isDisplayed();
				
				if(mob==true)
				{
					mobile.click();
					Screen_shot_1.Screenshot_test(driver);
					System.out.println("test is pass for mobile");
				}
	}

	@Override
	public void fashion_test() throws IOException 
	{
		//following node---without sibling
				//syntax-->//tagname[@attributename='attributevalue']/following::tagname[index]
		         WebElement fashion = driver.findElement(By.xpath(f_url));
		         boolean fas = fashion.isDisplayed();
		         if(fas== true)
		         {
		        	 fashion.click();
		        		Screen_shot_1.Screenshot_test(driver);
		        	 System.out.println("test is pass for fashion"); 
		         }
	}

	@Override
	public void electronic_test() throws IOException 
	{
		//following node---with sibling
		//syntax-->//tagname[@attributename='attributevalue']/following-sibling::tagname[index]
	        WebElement electronic = driver.findElement(By.xpath(e_url));
	        boolean ele = electronic.isDisplayed();
	        
	        if(ele == true)
	        {
	        	electronic.click();
	        	Screen_shot_1.Screenshot_test(driver);
	        	System.out.println("test pass for electronic");
	        }
	}

	@Override
	public void best_test() throws IOException 
	{
		 //preceding node--without sibling
        //syntax--> tagname[@attributename='attributevalue']/preceding::tagname
        WebElement best = driver.findElement(By.xpath(b_url));
        boolean bes = best.isDisplayed();
        
        	if (bes == true)
        	{
        		best.click();
        		Screen_shot_1.Screenshot_test(driver);
        		System.out.println("test is pass for home");
        	
        }
	}

	@Override
	public void prime_test() throws IOException {
		// preceding-sibling Node --> without sibling
				//  //tagname[@AttributeName = ' AttributeValue']/preceding-sibling::tagname
				WebElement prime = driver.findElement(By.xpath(best3));
				boolean pri = prime.isDisplayed();

				if (pri == true)
				{
					prime.click();
					Screen_shot_1.Screenshot_test(driver);
					System.out.println("Test is pass for prime");
				}
				
	}

	@Override
	public void logo_test() throws IOException {
		WebElement log = driver.findElement(By.xpath(logo));
		boolean lo = log.isDisplayed();

		if (lo == true)
		{
			log.click();
			Screen_shot_1.Screenshot_test(driver);
			System.out.println("Test is pass for logo");
		}
		
	}
}
