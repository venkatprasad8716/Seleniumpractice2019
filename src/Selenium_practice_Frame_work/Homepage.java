package Selenium_practice_Frame_work;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Homepage 
	{
		@FindBy (xpath="//img[@alt='Kite logo']") private WebElement actLogo;
		@FindBy (xpath="//div[@class='avatar']")  private WebElement actInitialName;
		
		public Homepage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//1. TO verify Logo
		
		public void verifyLogo()
		{
			
			boolean exp = true;
			boolean act = actLogo.isDisplayed();   //true
//			boolean actLogo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
			
			if (exp==act)
			{
				System.out.println("Logo verification test case is Pass");
			}
			else
			{
				System.out.println("Logo verification test case is Fail");
			}
		}	
	//2 To verify Initials
		
		public void verifyInitialName()
		{
			String expIName = "PM";
			String actIName = actInitialName.getText();
//			String actInitialName = driver.findElement(By.xpath("//div[@class='avatar']")).getText();
			if (expIName.equals(actIName))
			{
				System.out.println("Initial Name verification test case is Pass");
			}
			else
			{
				System.out.println("Initial Name verification test case is Fail");
			}
			
		}
				
				

	}

