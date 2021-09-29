package javapractice;
import java.util.*;
public class FindMinElementInArray {
	public static void minNumber(int arr[], Scanner scn) {
		for(int i =0; i<arr.length; ++i) {         //array loop
			arr[i] = scn.nextInt();
		}
		int min = arr[0];
		for(int i = 0; i<arr.length; ++i) {       //minmum loop
			if(arr[i]<min) {
				min = arr[i];
			}
		}System.out.println("Minimum number is : "+ min);
	}
	
//---------------------------------------------------------------
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the random 5 digit to find min of them : ");
		minNumber(arr, scn);
	}

}


