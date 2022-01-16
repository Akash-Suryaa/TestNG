package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {  // for this class testng.xml5 is applicable

	WebDriver driver= null;
	@Test
	public void Test1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\TestNG\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		System.out.println("I m in the test 1" );
		
		System.out.println("The Thread coutnt id is " +Thread.currentThread().getId());
		driver.quit();
		Thread.sleep(3000);
	}

     @Test
	public void Test2() throws Exception {

    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\TestNG\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	 
		System.out.println("I m in the test 2" );
		
		System.out.println("The Thread coutnt id is " +Thread.currentThread().getId());
		driver.quit();
		Thread.sleep(3000);
	}


}
