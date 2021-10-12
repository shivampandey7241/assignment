package javapractice;

import java.util.Scanner;

public class InClass11OctQ1 {
	public static void main(String[] args) {
		//       check panagram
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String str = s.nextLine();
		s.close();
		String inLower = str.toLowerCase();
		boolean flag = true;
		for(char i ='a'; i<='z';i++) {
			if(!inLower.contains(String.valueOf(i))) {
				flag = false;
			}
		}
		System.out.println("If string is panagram it shows :- 'true' if not than :- 'false'  ");
		System.out.println(flag);
	}
	

}
