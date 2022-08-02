package com.findmaximumwithgenerics;

public class FindTheMaximum< T extends Comparable<T>> {
	T num1,num2,num3,num4;
	public FindTheMaximum() {
		
	}
	
	public FindTheMaximum(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	public FindTheMaximum(T num1, T num2, T num3, T num4) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public void testMaximum() {
		FindTheMaximum.printMax(this.num1, this.num2, this.num3);
		
	}
	public void testMaximum4() {
		FindTheMaximum.printMax4(this.num1, this.num2, this.num3,this.num4);
		
	}
	public static <T extends Comparable<T>>T printMax4(T num1,T num2, T num3,T num4) {
		 
		T max = num1;
		 if ((num2.compareTo(max))>0) {
			 max = num2; 
		 }
		 if((num3.compareTo(max))>0){
			 max = num3 ;
		 }
		 if((num4.compareTo(max ))>0) {
			 max = num4 ;
		 }
		 System.out.println("Maximun Number is  : "+max);
		return max;
	}
	
	public static <T extends Comparable<T>>T printMax(T num1,T num2, T num3) {
		 T max = num1;
		 if ((num2.compareTo(max))>0) {
			 max = num2; 
		 }
		 if((num3.compareTo(max))>0){
			 max = num3 ;
		 }
		 System.out.println("Maximun Number is  : "+max);
		return max;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	T[] num;
//	
//	public FindTheMaximum(T[] num) {
//		this.num=num;
//	}
//	public <T> void maxNumber(T[] numArray) {
//			
//		for(int i=0; i < num.length;i++ ) {
//			if(numArray[i].compareTo(numArray[i+1])) > 0 ){
//				
//			}
//		}
//	
//	}
//	public static void main (String [] args)
//	{
//		Integer [] numArray = {100,45,67};
//		
//		
//		new FindTheMaximum<Integer>(numArray).maxNumber(numArray);
//	}
//	
//}
