package Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo {        // for this class testng.xml3 os applicable
	@Parameters("MyName")
	@Test
	public void test(String name ) {
		
	System.out.println("The name is " + name);
	}
	
	

}
