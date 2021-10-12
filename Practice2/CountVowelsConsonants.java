package javapractice;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
//		3.	Count the total number of vowels and consonants in a string
//		I/P- This is a really simple sentence
//		O/P- "Number of vowels= 10 AND Number of consonants= 17"
		
		Scanner s = new Scanner(System.in);
		System.out.println("String : ");
		String ustr = s.nextLine();
		String str = ustr.toLowerCase();
		s.close();
		int v =0;
		int c =0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				v++;
			}
			else if(str.charAt(i) != ' ') {
				c++;
			}
		}System.out.println("consonants : "+c+" vowels : "+v);
	}

}
