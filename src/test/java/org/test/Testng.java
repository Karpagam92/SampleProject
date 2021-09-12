package org.test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng {

	@BeforeClass
	public void tc1() {
		System.out.println("Before Class");
	}
	@BeforeSuite
	public void tc2() {
		System.out.println("Before Suite");
	}
	@BeforeMethod
	public void tc3() {
		System.out.println("Before Method");
	}
	@BeforeTest
	public void tc4() {
		System.out.println("Before Test");
	}
	@Test
	public void tc5() {
		System.out.println("Test");
		Assert.assertTrue(true);
	}
	
	@Test
	public void tc51() {
		System.out.println("Test");
	}
	@AfterTest
	public void tc6() {
		System.out.println("After Test");
	}
	@AfterMethod
	public void tc8() {
		System.out.println("After Method");
	}
	@AfterSuite
	public void tc10() {
		System.out.println("After Suite");
	}
	@AfterClass
	public void tc11() {
		System.out.println("After Class");
	}
}
