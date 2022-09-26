package com.info.pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.info.pom.login;

public class Test {

	public static void main(String[] args) 
	{
		 String Aurl = "https://www.demoblaze.com/index.html";
			String key ="webdriver.chrome.driver";
			String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(Aurl);
			
			login l = new login(driver);
			l.setHomelogin();
			l.SetuserName();
			l.setpassword();
			l.setloginButton();
			System.out.println("test is pass");
			
	}

}
