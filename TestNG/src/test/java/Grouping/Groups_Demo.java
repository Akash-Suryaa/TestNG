package Grouping;

import org.testng.annotations.Test;

@Test(groups = "AllClassTests")
public class Groups_Demo {
	
	//For this class testng.xml is applicable
	//we can define groups at class level also
	
	@Test(groups = "sanity")
	public void test1() {
		
		System.out.println("I m in the test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		
		System.out.println("I m in the test 2");
	}
	
	@Test(groups = {"regression","sanity"})
	public void test3() {
		
		System.out.println("I m in the test 3");
	}
	@Test
	public void test4() {
		
		System.out.println("I m in the test 4");
	}
	
	
	

}
