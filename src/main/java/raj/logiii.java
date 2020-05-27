package raj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class logiii {
   public void login()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay AM\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
   }
}
