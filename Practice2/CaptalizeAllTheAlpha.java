package javapractice;

import java.util.Scanner;

public class CaptalizeAllTheAlpha {
	public static void cap(String str) {
		System.out.println(str.toUpperCase());
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		cap(str);
	}

}
