package com.findmaximumwithgenerics;

public class FindMaximumDemo {
	
	public static void main (String [] args) {
		
		FindTheMaximum<Integer> findMaximumNumberInteger = new FindTheMaximum<Integer>();
		
		findMaximumNumberInteger.maxNumber(345, 6734, 3456);
		
		FindTheMaximum<Float> findMaximumNumberFloat = new FindTheMaximum<Float>();
		findMaximumNumberFloat.maxNumber(23.3f,44.2f, 55.3f);
	}

}
