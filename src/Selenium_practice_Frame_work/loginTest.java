package Selenium_practice_Frame_work;


	

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class loginTest 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://kite.zerodha.com/");
			
			
		String UNValue = "DP6852";
			String pwdValue = "Pramod@2105";
			String pinValue = "976976";  
			
			Loginpage lp= new Loginpage(driver);
			lp.enterUserName(UNValue);
			lp.enterPassword(pwdValue);
			lp.clickLoginButton();
			
			pinPage pp = new pinPage(driver);
			pp.enterPin(pinValue);
			pp.clickCntBtn();		
			
			Homepage hp= new Homepage(driver);
			hp.verifyLogo();
			hp.verifyInitialName();
			
			Thread.sleep(5000);
			driver.close();
			
		}
}
