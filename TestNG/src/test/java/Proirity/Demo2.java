package Proirity;

import org.testng.annotations.Test;

public class Demo2 {
	
	
	// when no priority Execution will be according to Alphabetic order 
	@Test
	public void one() {
		
		System.out.println("I m in the test 1");
		
	}
	
	@Test(priority = 0)
	public void two() {
		
		System.out.println("I m in the test 2");
		
	}
	
	@Test
	public void three() {
		
		System.out.println("I m in the test 3");
		
	}
	
	@Test(priority = -1)
	public void four() {
		
		System.out.println("I m in the test 4");
		
	}
	
	
	
	
	

}
