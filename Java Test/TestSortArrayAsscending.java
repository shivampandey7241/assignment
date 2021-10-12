package javapractice;

import java.util.Scanner;

public class TestSortArrayAsscending {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Size : ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter in array : ");
		for(int i=0;i<arr.length;++i) {
			arr[i] = s.nextInt();
		}
		s.close();
//-------------------------------------------------------------
		int temp =0;
		for(int i=0;i<arr.length;++i) {
			for(int j=i+1;j<arr.length;++j) {         
				if(arr[i] > arr[j]) {
					temp = arr[i];            
					arr[i] = arr[j];         
					arr[j] = temp;          
				}
			}
		}
//--------------------------------------------------------------
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]+" ");
		}
	}

}
