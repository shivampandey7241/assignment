package javapractice;
import java.util.*;
public class InClass28 {
	public static void main(String args[]) {
		int target = 20;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i =0; i<5; ++i) {
			arr[i] = s.nextInt();
		}
		System.out.println("array is.......");
		for(int i =0; i<5; ++i) {
			System.out.println(arr[i]);
			if(arr[i] == target) {
				System.out.println(arr[i]);
				break;
			}
			
		}
	}

}
