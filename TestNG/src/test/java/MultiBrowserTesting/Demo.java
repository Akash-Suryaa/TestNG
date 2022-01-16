
package MultiBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// multi Browser Testing = with help of paremeters annotations
//multi browser Testing with parellel= with help of parellel and thred count i testng1.xml
public class Demo {
	WebDriver driver = null;
	
	@Parameters("browserName")  // for this class testng1.xml is applicable
	@BeforeTest
	public void Set_Up(String browserName) {
		System.out.println("Browser name is " + browserName);
		System.out.println("Thread id is " + Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Akash/eclipse-workspace/TestNG/Drivers/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
	    if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", "C:/Users/Akash/eclipse-workspace/TestNG/Drivers/geckodriver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		
	}
	
	@Test
	public void Open_Browser() throws Exception {
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void Close_Test() {
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
