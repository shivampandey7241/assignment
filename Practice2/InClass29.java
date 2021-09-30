package javapractice;

public class InClass29 {
	public static void main(String[] args) {
		boolean flag = false;
		int arr [] = {2,3,1,4,5,6};
		int target = 10;
		for(int i = 0; i < arr.length; ++i) {
			for(int j = i+1; j <arr.length; ++j) {
				 int a = arr[i] + arr[j];
				 if(a == target) {
					 flag = true;
				 }
			}
		}
		if(flag == true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
