package javapractice;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your input :");		
Scanner scn = new Scanner(System.in);
String a = scn.nextLine();
scn.close();
int len = a.length();
//int half = len/2;
//System.out.println(half);
String revStr = "";
for(int i = (len - 1); i>= 0; --i) {
	revStr = revStr + a.charAt(i);
	
}System.out.println(revStr);
if(a.equals(revStr)) {
	System.out.println("it is palindrome "+revStr);
}else {
	System.out.println("it is not palindrome "+a);
}

	}

}
