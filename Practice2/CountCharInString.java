package javapractice;

import java.util.Scanner;

public class CountCharInString {
	public static void main(String[] args) {
//		1. Program to count the total number of characters in a string->
//		I/P- The best of both worlds
//		O/P- 19
		
		Scanner s = new Scanner(System.in);
		System.out.println("String : ");
		String str = s.nextLine();
		s.close();
		
		
		int chr =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				chr++;
			}
		}
		System.out.println(chr+" : without space :- ''");
		System.out.println(str.length()+" : with space between char :- '_' ");
	}

}
