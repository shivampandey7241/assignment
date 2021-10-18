package leetcode;

import java.util.Scanner;

public class BuyAndSellStockV2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Size of array : ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the "+size+" number : ");
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		
		int profit = 0;
		int minvalue = arr[0];
		int j = 0;
		for(; j <arr.length; ++j) {
			if(arr[j] < minvalue) {
				minvalue = arr[j];
			}
			else if (arr[j] - minvalue > profit) {
				profit = arr[j] - minvalue;
			}
		}
		System.out.println("maxprofit : "+profit +"  @day : "+j);
	}

}
