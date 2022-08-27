package junitTestcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculator.calculator;
import junit.framework.Assert;

public class JunitTestCases2 {
	
	public class JunitTestCases {
		
		calculator objcalculator=new calculator();
	
		@Before
		public void setUp() throws Exception {
			
			System.out.println("Test case for Calculator Class ");
			
		}
	
		@After
		public void tearDown() throws Exception {
			
			System.out.println("Test case for Calculator Class Ended ");
		}
		
		
	
		@Test
		public void testAdditon() {
					
			Assert.assertEquals("Checking Addiotn funcaitonality", 18, objcalculator.addition(12, 6));
		}
	
		@Test
		public void testSubstraction() {
			Assert.assertEquals("Checking substaraction funcaitonality", 6, objcalculator.Substraction(12, 6));
		}
	
		@Test
		public void testMultiplicaiton() {
			Assert.assertEquals("Checking Multiplicaiton funcaitonality", 72, objcalculator.Multiplicaiton(12, 6));
		}
		
	//	@Test
	//	public void testprotectedMultiplicaiton() {
	//		Assert.assertEquals("Checking Multiplicaiton funcaitonality", 72, objcalculator.protectedMultiplicaiton(12, 6));
	//	}
	
		@Test
		public void testDivistion() {
			Assert.assertEquals("Checking Divistion funcaitonality", 6, objcalculator.divistion(12, 2));
		}
	
	}

	calculator objcalculator=new calculator();

	@Before
	public void setUp() throws Exception {
		
		System.out.println("Test case for Calculator Class ");
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Test case for Calculator Class Ended ");
	}
	
	

	@Test
	public void testAdditon() {
				
		Assert.assertEquals("Checking Addiotn funcaitonality", 18, objcalculator.addition(12, 6));
	}

	@Test
	public void testSubstraction() {
		Assert.assertEquals("Checking substaraction funcaitonality", 6, objcalculator.Substraction(12, 6));
	}

	@Test
	public void testMultiplicaiton() {
		Assert.assertEquals("Checking Multiplicaiton funcaitonality", 72, objcalculator.Multiplicaiton(12, 6));
	}
	
//	@Test
//	public void testprotectedMultiplicaiton() {
//		Assert.assertEquals("Checking Multiplicaiton funcaitonality", 72, objcalculator.protectedMultiplicaiton(12, 6));
//	}

	@Test
	public void testDivistion() {
		Assert.assertEquals("Checking Divistion funcaitonality", 6, objcalculator.divistion(12, 2));
	}

}
