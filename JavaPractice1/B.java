package javapractice;

import java.util.Scanner;

public class B {

	public static void add(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number to add :");
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.println(num1+num2);
		scn.close();

	}public void sub(int a, int b) {
		System.out.println("enter the number to sub :");
//		Scanner scn1 = new Scanner(System.in);
//		int num11 = scn1.nextInt();
//		int num22 = scn1.nextInt();
		System.out.println( a - b);
//		scn1.close();

	}

}
