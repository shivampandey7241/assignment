package javapractice;

import java.util.Scanner;

public class InClassOct182DArrayQ4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = s.nextInt();
			}
		}
		s.close();
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j] == arr[j][j]) {
					flag = true;
				}
			}
    
		}	
		System.out.println(flag);
	}

}
