package javapractice;

public class MethodOverloadingB {
	
//	                                        ------METHOD OVERLOADING------
	
//	                                           sum of 2 int
	
	public static void sumOf(int a, int b) {
		System.out.println(a+b);
	}
//	-----------------------------------------------------------------------------------------------------------
	
//                                             sum of 3 int
	
	public static void sumOf(int a, int b, int c) {
		System.out.println(a+b+c);
	}
//	-----------------------------------------------------------------------------------------------------------
	
//                                             sum of 2 double
	
	public static void sumOf(double a ,double b) {
		System.out.println(a+b);
	}
	
	
}
