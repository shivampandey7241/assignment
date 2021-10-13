package javapractice;

import java.util.Scanner;

public class SwapString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("String 1 : ");
		String str1 = s.nextLine();
		System.out.print("String 2 : ");
		String str2 = s.nextLine();
		s.close();
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
	}

}
