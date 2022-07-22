package com.findmaximumwithgenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheMaximunTest {

	@Test
	void testMaxNumberIntegerAtFirst() {
		assertEquals(34, FindTheMaximum.printMax(34, 13, 6));
	}
	@Test
	void testMaxNumberIntegerAtSecond() {
		assertEquals(153, FindTheMaximum.printMax(34, 153, 6));
	}
	@Test
	void testMaxNumberIntegerAtThird() {
		assertEquals(600, FindTheMaximum.printMax(34, 153, 600));
	}
	
	
	@Test
	void testMaxNumberFloatAtFirst() {
		assertEquals(34.3f, FindTheMaximum.printMax(34.3f, 13.3f, 6.1f));
	}
	@Test
	void testMaxNumberFloatAtSecond() {
		assertEquals(133.3f, FindTheMaximum.printMax(34.3f, 133.3f, 6.1f));
	}
	@Test
	void testMaxNumberFloatAtThird() {
		assertEquals(600.1f, FindTheMaximum.printMax(34.3f, 133.3f, 600.1f));	
	}
	

	@Test
	void testMaxStringAtFirst() {
		assertEquals("Peach", FindTheMaximum.printMax("Peach","Apple","Banana"));
	}
	@Test
	void testMaxStringAtSecond() {
		assertEquals("reach", FindTheMaximum.printMax("Apple","reach","Banana"));
	}
	@Test
	void testMaxStringAtThird() {
		assertEquals("zoo", FindTheMaximum.printMax("Apple","Banana","zoo"));
	}

	
}
