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
	// with four parameter 	
	@Test
	void testMaxNumberIntegerAtFirst1() {
		assertEquals(64, FindTheMaximum.printMax4(34, 13, 6, 64));
	}
	@Test
	void testMaxNumberIntegerAtSecond1() {
		assertEquals(153, FindTheMaximum.printMax4(34, 153, 6, 35));
	}
	@Test
	void testMaxNumberIntegerAtThird1() {
		assertEquals(600, FindTheMaximum.printMax4(34, 153, 600,100));
	}
	@Test
	void testMaxNumberIntegerAtFourth() {
		assertEquals(1000, FindTheMaximum.printMax4(34, 153, 600,1000));
	}
	
	
	@Test
	void testMaxNumberFloatAtFirst1() {
		assertEquals(34.3f, FindTheMaximum.printMax4(34.3f, 13.3f, 6.1f, 4.3f));
	}
	@Test
	void testMaxNumberFloatAtSecond1() {
		assertEquals(134.3f, FindTheMaximum.printMax4(36.3f, 134.3f, 6.1f, 4.3f));
	}
	@Test
	void testMaxNumberFloatAtThird1() {
		assertEquals(600.1f, FindTheMaximum.printMax4(34.3f, 133.3f, 600.1f,10.2f));	
	}
	@Test
	void testMaxNumberFloatAtFourth() {
		assertEquals(1000.2f, FindTheMaximum.printMax4(34.3f, 133.3f, 600.1f,1000.2f));	
	}
	
	@Test
	void testMaxStringAtFirst1() {
		assertEquals("Peach", FindTheMaximum.printMax4("Peach","Apple","Banana","Ape"));
	}
	@Test
	void testMaxStringAtSecond1() {
		assertEquals("Reach", FindTheMaximum.printMax4("Apple","Reach","Banana","Cat"));
	}
	@Test
	void testMaxStringAtThird1() {
		assertEquals("Zoo", FindTheMaximum.printMax4("Apple","Banana","Zoo","Dog"));
	}
	@Test
	void testMaxStringAtFourth() {
		assertEquals("Zoo", FindTheMaximum.printMax4("Apple","Banana","Zom","Zoo"));
	}	
}
