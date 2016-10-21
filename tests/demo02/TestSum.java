package demo02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {
	
	@Test
	public void testSum2Number(){
		assertEquals(6,sum(2,4));
	}
	@Test
	public void testSumWithZero(){
		assertEquals(4, sum(0,4));
		assertEquals(4,sum(4,0));
	}
	
	int sum(int a, int b){
		return a+b;
	}

}
