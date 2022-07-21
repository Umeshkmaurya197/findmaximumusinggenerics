package com.findmaximumwithgenerics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheMaximunTest {

	FindTheMaximum<Integer> findTheMaximum = new FindTheMaximum<Integer>();
	@Test
	void testMaxNumberAtFirst() {
		assertEquals(34, findTheMaximum.maxNumber(34, 13, 6));
	}
	@Test
	void testMaxNumberAtSecond() {
		assertEquals(153, findTheMaximum.maxNumber(34, 153, 6));
	}
	@Test
	void testMaxNumberAtThird() {
		assertEquals(600, findTheMaximum.maxNumber(34, 153, 600));
	}
	


}
