package javapractice;
import java.util.*;
//Find the number which appears only 1 time in the array.
//Try using different methods to solve this problem.
//Input: arr[] = { 20, 10, 30, 10, 30} 
//Output: 20 
//In the given array all element appear two times except 20 which appears once.
//Java program to find first non-repeating
//element.
class Number1Times {
	public static void nonRepeating(int arr[]) {
		int lenarr = arr.length;
		int store = 0;
		boolean flag = false;
		for(int i = 0; i<lenarr; ++i) {
			store = arr[i];
			for(int j =0; j<lenarr; ++j) {
				if(store == arr[j] && i!=j) {
					store = 0;
					break;
				}
			}
			if(store != 0) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Not repeated "+store);
		}else {
			System.out.println("Repeated");
		}
	}
	
//-----------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int length = s.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter "+ length +" number : ");
		for(int i =0; i < length; ++i) {
			arr[i] = s.nextInt();
		}
		nonRepeating(arr);
		s.close();
	}
}