package javapractice;

public class Nov10InClass2D_ArrayQ3 {
	public static void main(String[] args) {
		int arr[][] = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i][i];	
		}System.out.print(sum);
	}

}
