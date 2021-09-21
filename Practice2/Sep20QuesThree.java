package javapractice;

//import java.util.Scanner;

public class Sep20QuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Given array I/p- [1,2,4,6,8,12,76,23,64]  n = 76 o/p= [1,2,4,6,8,12,0,23,64]
//		done by my-self
		int[] arr = {1,2,4,6,8,12,76,23,64};
		int x = 76;
		boolean flag = false;
		int a = -1;
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
			if(arr[i] == x ) {
				a = i;
				flag = true;
			}
			
		}
		if(flag == true) {
			System.out.println("found " + a);
			arr[6] = 0;
			for(int i = 0; i < arr.length; ++i) {
				System.out.println(arr[i]);
			}

		}

	}

}
