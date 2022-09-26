package Selenium_practice_Frame_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice {
@FindBy(xpath="")WebElement ub;


public practice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String use)
{
	ub.sendKeys(use);
}
}
