package com.findmaximumwithgenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheMaximunTest {

	FindTheMaximum<Integer> findTheMaximumInteger = new FindTheMaximum<Integer>();
	
	FindTheMaximum<Float> findTheMaximumFloat =new FindTheMaximum<Float>();
	
	FindTheMaximum<String> findTheMaximumString =new FindTheMaximum<String>();
	@Test
	void testMaxNumberIntegerAtFirst() {
		assertEquals(34, findTheMaximumInteger.max(34, 13, 6));
	}
	@Test
	void testMaxNumberIntegerAtSecond() {
		assertEquals(153, findTheMaximumInteger.max(34, 153, 6));
	}
	@Test
	void testMaxNumberIntegerAtThird() {
		assertEquals(600, findTheMaximumInteger.max(34, 153, 600));
	}
	
	
	@Test
	void testMaxNumberFloatAtFirst() {
		assertEquals(34.3f, findTheMaximumFloat.max(34.3f, 13.3f, 6.1f));
	}
	@Test
	void testMaxNumberFloatAtSecond() {
		assertEquals(133.3f, findTheMaximumFloat.max(34.3f, 133.3f, 6.1f));
	}
	@Test
	void testMaxNumberFloatAtThird() {
		assertEquals(600.1f, findTheMaximumFloat.max(34.3f, 133.3f, 600.1f));	
	}
	

	@Test
	void testMaxStringAtFirst() {
		assertEquals("Peach", findTheMaximumString.max("Peach","Apple","Banana"));
	}
	@Test
	void testMaxStringAtSecond() {
		assertEquals("Peach", findTheMaximumString.max("Apple","Peach","Banana"));
	}
	@Test
	void testMaxStringAtThird() {
		assertEquals("Peach", findTheMaximumString.max("Apple","Banana","Peach"));
	}

	
}
