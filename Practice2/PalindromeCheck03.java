package javapractice;

import java.util.Scanner;

public class PalindromeCheck03 {
	 static boolean palimm(String str) {
		 StringBuilder a =new StringBuilder(str);  
		  a.reverse();
//		 System.out.println(b);
		 String rev=a.toString();
		 if(str.equals(rev)) {
			 return true;
		 }else {
			 return false;
		 }
	}public static void main(String [] args) {
		System.out.println("Enetr the number or string to check palindrome");
		Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
		scn.close();
		if(palimm(x)) {
			System.out.println("This is palindrome :"+x);
		}else {
			System.out.println("This is not palindrome :"+x);
		}
		
	}

}
