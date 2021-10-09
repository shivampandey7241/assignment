package javapractice;

import java.util.Scanner;

public class PanagramCheck {
	public static void main(String[] args) {
//		Write a java program to check for panagrams.
//
//		A pangram is a sentence where every letter of 
//		the English alphabet appears at least once.
//
//		Given a string sentence containing only lowercase
//		English letters, return true if sentence is a pangram, or false otherwise.
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = s.nextLine();
		int len = str.length();
		s.close();
		boolean flag = false;
		
		
			for(char ch ='a'; ch<= 'z'; ch++) {
				if(!str.contains(String.valueOf(ch))){
					flag =true;
					break;
				}
			}
			if(flag == true) {
				System.out.println("false");
			}else {
				System.out.println("true");
			}
		
	}

}
