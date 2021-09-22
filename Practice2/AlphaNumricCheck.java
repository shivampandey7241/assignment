package javapractice;


import java.util.Scanner;
import java.util.regex.*;

public class AlphaNumricCheck {
	public static boolean alphaNum(String str) {
		if(str.matches("[a-zA-Z0-9]+")) {
			return true;
		}return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = s.nextLine();
		if(alphaNum(str)) {
			System.out.println("This is Alpha-Numric :"+str);
		}else {
			System.out.println("This is not Alpha-Numric "+str);
		}
	}
}
