package Grouping;

import org.testng.annotations.Test;

// metagroup means create our own custom groups we can decide what to include and what to exclude
// for this class testng.xml2 is applicable
public class MetaGroups {
	
	@Test(groups = "sanity")
	public void test1() {
		
		System.out.println("I m in the test 1");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		
		System.out.println("I m in the test 2");
	}
	
	@Test(groups = {"regression"})
	public void test3() {
		
		System.out.println("I m in the test 3");
	}
	@Test
	public void test4() {
		
		System.out.println("I m in the test 4");
	}
	
	
	
	
	
	
	
	
	
	
	

}
