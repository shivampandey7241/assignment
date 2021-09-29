package javapractice;
import java.util.*;


//Create a method that takes an array of size 5 and populates it using
//user input, then print TRUE if the input array is in ascending 
//order else print FALSE if the input array is not in ascending order.


public class FindAscendingOrderOrNot {
	public static boolean ascendingOrNot(int arr[], Scanner scn) {
		for(int i =0; i<arr.length; ++i) {               // Array loop
			arr[i]=scn.nextInt();
		}
//		boolean flag = false;
		for(int i=0; i<arr.length; ++i) {               // Ascending order loop
			for(int j = i+1; j<arr.length; ++j) {
				if(arr[i]<arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
//----------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the 5 digit number to check asending order : ");
		if(ascendingOrNot(arr, scn) == true) {
			System.out.println("Ascending order");
		}else {
			System.out.println("Not Ascending");
		}
	}

}
