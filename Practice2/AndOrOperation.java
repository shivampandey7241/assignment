package javapractice;

import java.util.Scanner;

public class AndOrOperation {
	public static void main(String[] args) {
//		Take 2 number from user and do And/OR operations and print
//		them 
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int num1 = scn.nextInt();
		System.out.print("Enter 2nd number : ");
		int num2 = scn.nextInt();
//		System.out.println("Target is 99");
		scn.close();
		
		
		System.out.println(num1+" & "+num2+" = "+(num1&num2));
		System.out.println(num1+" | "+num2+" = "+(num1|num2));
		
		
	}

}
