package com.findmaximumwithgenerics;

public class FindMaximumDemo {
	
	public static void main (String [] args) {
		

		FindTheMaximum<Integer> findTheMaximumInteger =new FindTheMaximum<Integer>(344, 734, 3456);
		findTheMaximumInteger.testMaximum();
	
		FindTheMaximum<Float> findTheMaximumFloat =new FindTheMaximum<Float>(23.3f,44.2f, 55.3f);
		findTheMaximumFloat.testMaximum();
	
		FindTheMaximum<String> findTheMaximumString =new FindTheMaximum<String>("Apple", "Peach", "Banana");
		findTheMaximumString.testMaximum();
	
	}

}

//FindTheMaximum<Integer> findMaximumNumberInteger = new FindTheMaximum<Integer>();
//
//findMaximumNumberInteger.max(344, 734, 3456);
//
//FindTheMaximum<Float> findMaximumNumberFloat = new FindTheMaximum<Float>();
//findMaximumNumberFloat.max(23.3f,44.2f, 55.3f);
//
//FindTheMaximum<String> findTheMaximumString = new FindTheMaximum<String>();
//findTheMaximumString.max("Apple", "Peach", "Banana");

