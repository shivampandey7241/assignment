package javapractice;

import java.util.Scanner;

public class InClassOct182DArrayQ3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String arr[][] = new String[2][3];
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = s.next();
				
			}
			
		}
		s.close();
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
