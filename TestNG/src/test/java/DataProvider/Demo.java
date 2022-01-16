
package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Demo {
WebDriver driver = null;
	
	
	@org.testng.annotations.Test(dataProvider = "AllData")
	public void Test(String username, String password) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Akash/eclipse-workspace/TestNG/Drivers/ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	driver.close();
	}
	
	
	@DataProvider(name ="AllData")
	public Object[][] passData(){
		
		Object [][] data = new Object[2][2];
		data[0][0] ="Admin";// username 
		data[0][1] ="admin123";// password
		data[1][0] ="Akash";
		data[1][1] ="dmin1234";
		
		return data;
		
		
	}
	
	
	
	
	
	
	
}
