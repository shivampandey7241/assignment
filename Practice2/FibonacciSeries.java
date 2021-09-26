package javapractice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		int firstNum = 0;       // selecting starting point as 0.
		int secondNum = 1;       // selecting second number point as 1.
		System.out.print("Enter the length : ");
		int length = scn.nextInt();      // taking the user input for length.
		int thirdNum;
//------------------------------------------------------------------------------
		System.out.print(firstNum+" "+secondNum);
		
		for(int i = 2; i < length; ++i){
		    thirdNum = secondNum + firstNum;
		    firstNum = secondNum;
		    secondNum = thirdNum;
		    
		    System.out.print(" "+thirdNum);
		}
	}

}
