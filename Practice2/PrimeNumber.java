package javapractice;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2; i<=Math.sqrt(n); ++i) {
			if(n%i == 0) {
				return false;
			}
		}return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scn.nextInt();
		System.out.println("enter last number");
		int b = scn.nextInt();
		scn.close();
		for(int i = a; i<=b; ++i){
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
}
