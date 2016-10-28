package demo02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRest {

	@Test
	public void testResta(){
		assertEquals(2, resta(4,2));
	}
	
	private int resta(int a, int b){
		return a-b;
	}
}
