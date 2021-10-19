package javapractice;

import java.util.Scanner;

public class _2DArraySumOfColumn1and2EqualTo3Column {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Size : ");
		int size = s.nextInt();
		int arr[][] = new int[size][size];
		System.out.println("Enter Int in "+size+" x "+size+" Array : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		s.close();
//--------------------------------------------------------------------------
		boolean flag = true;
		for(int i=0; i<arr.length;i++) {
			for(int j=1; j<arr[i].length-1;j++) {
				if((arr[i][j]) + (arr[i][j-1]) != arr[i][arr.length-1]) {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag);	
	}

}
