package IgnoreTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void add() {
		
		System.out.println("I m in the add method");
		
	}
	
	@Test
	@Ignore
	public void addAll() {
		
		System.out.println("I m in the addAll method");
		
		
	}

}
