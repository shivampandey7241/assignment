package geekster.java.com;

import java.util.Scanner;

public class B {

	public static void addition() {
		float x = 23;
		float y = 20;
		float z = (x+y);
		System.out.println(z);

	}public static void subtract() {
		float x = 30;
		float y = 20;
		float z = (x-y);
		System.out.println(z);
		
	}static void sum() {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		scn.close();
		int add = (x+y);
		
		System.out.println(add);
	}

}
