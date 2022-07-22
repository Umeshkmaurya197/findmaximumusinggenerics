package com.findmaximumwithgenerics;

public class FindMaximumDemo {
	
	public static void main (String [] args) {
		
		FindTheMaximum<Integer> findTheMaximumInteger =new FindTheMaximum<Integer>(344, 734, 3456);
		findTheMaximumInteger.testMaximum();
	
		FindTheMaximum<Float> findTheMaximumFloat =new FindTheMaximum<Float>(23.3f,44.2f, 55.3f);
		findTheMaximumFloat.testMaximum();
	
		FindTheMaximum<String> findTheMaximumString =new FindTheMaximum<String>("Apple", "Peach", "Banana");
		findTheMaximumString.testMaximum();
	
		System.out.println("--------Test MAximum with four parameter----- ");
		
		FindTheMaximum<Integer> findTheMaximumInteger1 =new FindTheMaximum<Integer>(344, 734, 3456, 4345);
		findTheMaximumInteger1.testMaximum4();
	
		FindTheMaximum<Float> findTheMaximumFloat1 =new FindTheMaximum<Float>(23.3f,44.2f, 55.3f, 342.2f);
		findTheMaximumFloat1.testMaximum4();
	
		FindTheMaximum<String> findTheMaximumString1 =new FindTheMaximum<String>("Apple", "Peach", "Banana","zoo");
		findTheMaximumString1.testMaximum4();
	
	}

}
