package javapractice;

import java.util.Scanner;

public class OnClass {
	public static void add(int a, int b) {
		System.out.println("Sum of "+a+" and "+b+" number is : "+(a+b));
	}
	public static void mult(int c, int d) {
		System.out.println("Multiplication of "+c+" and "+d+" number is : "+(c*d));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your first number : ");
//		String str = s.nextLine();
		int a = s.nextInt();
		System.out.print("Enter your second number : ");
		int b = s.nextInt();
		s.close();
			add(a , b);
			mult(a , b);
		
//		mult(a , b);
	}

}
