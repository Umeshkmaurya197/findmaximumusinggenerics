package com.findmaximumwithgenerics;

public class FindMaximumDemo {
	
	public static void main (String [] args) {
		
		FindTheMaximum<Integer> findMaximumNumberInteger = new FindTheMaximum<Integer>();
		
		findMaximumNumberInteger.max(345, 6734, 3456);
		
		FindTheMaximum<Float> findMaximumNumberFloat = new FindTheMaximum<Float>();
		findMaximumNumberFloat.max(23.3f,44.2f, 55.3f);
		
		FindTheMaximum<String> findTheMaximumString = new FindTheMaximum<String>();
		findTheMaximumString.max("Apple", "Peach", "Banana");
	}

}
