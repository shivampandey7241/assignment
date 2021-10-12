package javapractice;

import java.util.Scanner;

public class CountPunctuationChar {
	public static void main(String[] args) {
//		2.	Count the Total Number of Punctuation Characters Exists in a String
//		I/P- He said, 'The mailman loves you.' I heard it with my own ears.
//		O/P- 5
		
		Scanner s = new Scanner(System.in);
//		System.out.println("Punctuation :- ");
		System.out.println("String : ");

		String str = s.nextLine();
        s.close();
        int c=0;
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!' || str.charAt(i) == '-' || str.charAt(i) == '?' || str.charAt(i) == ';' || str.charAt(i) == '\'' || str.charAt(i) == '\"') {
        		c++;
        	}
        }System.out.println("Number of Punctuation char in string : "+c);
		
	}

}
