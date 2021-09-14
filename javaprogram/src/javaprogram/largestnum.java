package javaprogram;

public class largestnum {

	public static void main(String[] args) {
		int[]arr = {1,2,3,9,4,5,6};
		int b = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>b) {
				b = arr[i];
			}
		}System.out.println(b);

	}

}
