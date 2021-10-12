package javapractice;

import java.util.Scanner;

public class TestTermOfAP1 {
	public static void main(String[] args) {
//		             ---QUESTION---
//		Write a program to print first x terms of the 
//		 series 3N + 2 which are not multiples of 4.
		Scanner s =new Scanner(System.in);
		int x = s.nextInt();
		s.close();
//------------------------------------------------------		
		int count = 0;
		for(int i=1; count<x; i++) {
			int a = 3*i+2;
			if(a % 4 != 0) {
				System.out.print(a+" ");
				count++;

			}
		}
	}

}
