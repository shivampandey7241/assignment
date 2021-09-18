package javapractice;

import java.util.Scanner;

public class PalindromeCheck02 {
	static boolean palin(String  str) {
		int i = 0;
		int j = str.length() - 1 ;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}++i;
			--j;
		}return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter the input to check palindrome");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		scn.close();
		if (palin(str)) {
			System.out.println("It is palindrome " + str);
		}else {
			System.out.println("It is not a palindrome " + str);
		}
	}

}
