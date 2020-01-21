package com.sansoft.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sansoft.main.MyMath;

public class MyMath_Test {
	
	MyMath object = new MyMath();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executed before the test once!!");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Executed after the test once!!");
	}
	@Before
	public void doStuffBerfore() {
		System.out.println("Executed Before each test");
	}
	
	@After 
	public void doStuffAfter() {
		System.out.println("Executed After each test");
	}
	
	@Test
	public void computeSumTest() {
		System.out.println("Inside the method Test");
		int result = object.computeSum(new int[] {1, 2, 3});
		// assertEquals(expectedValue, originalValue);
		assertEquals(6, result);
	}
	
	@Test
	public void computeAnotherSum() {
		System.out.println("Inside the another method Test");
		int result = object.computeSum(new int[] {1, 2, 3, 4});
		assertEquals(10, result);
	}
	
}
