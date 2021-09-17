package javapractice;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to reverse");
Scanner scn = new Scanner(System.in);
String num = scn.nextLine();
scn.close();
int len = num.length();
String revrse = "";
for(int i = (len - 1); i>= 0; --i) {
	revrse = revrse + num.charAt(i);
}System.out.println(revrse);
	}

}
