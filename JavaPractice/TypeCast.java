package geekster.java.com;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		
			System.out.println("enter your number :");
			Scanner scn = new Scanner(System.in);
			int x = scn.nextInt();
			double y = x;
			System.out.print(y);
			
			scn.close();

	}

}
