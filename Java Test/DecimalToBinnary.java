package javapractice;

import java.util.Scanner;

public class DecimalToBinnary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int arr[] = new int[40];
		int i =0;
		if(num == 0) {
			System.out.println(0);
		}else {
		while(num > 0) {
			arr[i++] = num%2;
			num = num/2;
		}
		for(int j= i-1; j>=0; j--) {
			System.out.print(arr[j]);
		}
		}
	}

}
