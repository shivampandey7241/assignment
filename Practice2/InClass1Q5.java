package javapractice;

import java.util.Scanner;
//odd and even detector
public class InClass1Q5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int b = scn.nextInt();
		scn.close();
		
//--------------------------------------------------------- 
		
		
		if( (b^1) > b) {
			System.out.print(b+" : EVEN");
		}
		else {
			System.out.print(b+" : ODD");
		}
	}

}
