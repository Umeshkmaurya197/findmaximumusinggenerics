package com.findmaximumwithgenerics;

public class FindMaximumDemo {
	
	public static void main (String []args) {
		
		FindTheMaximum<Integer> findMaximumNumber = new FindTheMaximum<Integer>();
		
		findMaximumNumber.maxNumber(345, 6734, 3456);
		
	}

}
