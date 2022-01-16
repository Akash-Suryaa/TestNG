package DependsOnMethods;

import org.testng.annotations.Test;

public class Demo {
	//@Test(dependsOnMethods = "test2",priority = 1)  try this at the time of study
	
	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("I m in the test1");
		
	}
	
	@Test()
	public void test2() {
		System.out.println("I m in the test2");
		
	}
	
	@Test
	public void test3() {
		System.out.println("I m in the Test3");
		
	}
	
	
	

}
