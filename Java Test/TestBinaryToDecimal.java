package javapractice;

import java.util.Scanner;

public class TestBinaryToDecimal {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.print("Enter the binary : ");
		String str = s.nextLine();
		s.close();
		int len = str.length();
//------------------------------------------------------		
		int sum=0;
		int power = 1;
		for(int i=len-1;i>=0;--i) {
			if(str.charAt(i) == '1') {
				sum += power;
			}
			power *= 2;
		}
		System.out.println("Ans : "+sum);
		
	}

}
