package javapractice;
import java.util.*;
public class InClass2Q28 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 5 random number to find max of it : ");
		int arr[] = new int [5];
		int b = arr[0];
		for(int i =0; i<5; ++i) {
			arr[i] = s.nextInt();
		}s.close();
		for(int i=0; i<arr.length; ++i) {
			if(arr[i] > b) {
				b = arr[i];
			}
		}System.out.print("Biggest number is : ");
		System.out.println(b);
		
	    

	}	
}