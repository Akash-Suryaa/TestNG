package Proirity;

import org.testng.annotations.Test;

public class Demo3 {
	
	
	@Test(priority = 1)
	public void add() {
		System.out.println("I m in the add method");
	}

	@Test(priority = 0)
	public void add1() {
		System.out.println("I m in the add1 method");
	}

	@Test(priority = 2)
	public void add2() {
		System.out.println("I m in the add2 method");
	}

	@Test(priority = -1)
	public void add3() {
		System.out.println("I m in the add3 method");
	}

	@Test
	public void add4() {
		System.out.println("I m in the add4 method");
	}

}
