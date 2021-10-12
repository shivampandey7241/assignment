package javapractice;

import java.util.Scanner;

public class InClass11OctQ2 {
	public static void main(String[] args) {
		
//		        Split world
		Scanner s = new Scanner(System.in);
		System.out.print("String : ");
		String str = s.nextLine();
		System.out.println("split : ");
		String split = s.next();
		s.close();
		String splitStr[] = str.split(split);
		for(String i : splitStr) {
			System.out.println(i);
		}
	}

}
