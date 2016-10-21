package demo02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {
	
	@Test
	public void testSum2Number(){
		assertEquals(6,Sum.sum(2,4));
	}
	@Test
	public void testSumWithZero(){
		assertEquals(4, Sum.sum(0,4));
		assertEquals(4,Sum.sum(4,0));
	}
	@Test
	public void testSumWithNegativos(){
		assertEquals(10, Sum.sum(12,-2));
		assertEquals(-7,Sum.sum(-4,-3));
	}
	
	

}
