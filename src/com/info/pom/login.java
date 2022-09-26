package com.info.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	// Encapsulation
	//Datamember declaration
private WebElement homeLoginButton;
private WebElement userName;
private WebElement password;
private WebElement loginButton;
WebDriver driver;

//initialization
public login(WebDriver driver)
{

this .driver = driver;
homeLoginButton = driver.findElement(By.id("login2"));
userName = driver.findElement(By.id("loginusername"));
password = driver.findElement(By.id("loginpassword"));
loginButton = driver.findElement(By.xpath("//button[@class='btn btn-secondary'])[3]"));
}

//usage
public void setHomelogin ()
{
	homeLoginButton.click();
}
public void SetuserName()
{
	userName.sendKeys("venkatprasad011@gmail.com");
	
}
public void setpassword ()
{
	password.sendKeys("Venkat@8716");
}
public void setloginButton()
{
	loginButton.click();
}
}
