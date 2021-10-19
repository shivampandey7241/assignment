package javapractice;
import java.util.*;
public class InClassOct182DArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][] = new int[2][3];
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = s.nextInt();
			}
		}
		s.close();
		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
