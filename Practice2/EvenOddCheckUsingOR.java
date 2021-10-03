package javapractice;

import java.util.Scanner;
//    Check if number is even or odd using OR.
public class EvenOddCheckUsingOR {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scn.nextInt();
		int or = num|1;
//--------------------------------------------------------------------		
		if(or>num) {
			System.out.println("Even : "+num);
		}else {
			System.out.println("Odd : "+num);
		}
	}

}
