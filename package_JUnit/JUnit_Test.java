package package_JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_Test {

	
	@BeforeClass
	public static void beforeClassMethod() {
	System.out.println("Inside Before Class method");
	}

	@Before
	public void beforeMethod() {
	System.out.println("Inside Before Method");
	}

	@Test
	public void test() {
	System.out.println("Inside Test method");
	}

	@After
	public void afterMethod() {
	System.out.println("Inside After method");
	}

	@AfterClass
	public static void afterClassMethod() {
	System.out.println("Inside After Class method");
	}
		
}
