package Selenium_practice.practice;

import java.io.IOException;

public interface Advance_Xpath_interface {
	 String Aurl = "https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e";
		String key ="webdriver.chrome.driver";
		String value = "G:\\selenium\\chromedriver_win32\\chromedriver.exe";
		
String t_url = "//form/div[2]/div[1]/input";
 String	m_url = "//*[@data-csa-c-content-id='nav_cs_mobiles']/self::a";
 String f_url  ="//*[@data-csa-c-content-id='nav_cs_mobiles']/following::a[3]";
 String e_url ="//*[@data-csa-c-content-id='nav_cs_mobiles']/following-sibling::a[4]";
 String b_url = "//*[@data-csa-c-content-id='nav_cs_mobiles']/preceding::a[contains(text(),'Best Sellers')]";
  String best3 = "//*[@data-csa-c-content-id='nav_cs_mobiles']/preceding-sibling::a";
 String logo ="//header/div[1]/div[1]/div[1]/div/a";
 public void textbox_test() throws IOException;
 public void mobile_test() throws IOException;
 public void fashion_test() throws IOException;
 public void electronic_test() throws IOException;;
 public void best_test() throws IOException;;
 public void prime_test() throws IOException;;
public void logo_test() throws IOException;
}
