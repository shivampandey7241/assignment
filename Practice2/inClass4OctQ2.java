package javapractice;

public class inClass4OctQ2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1};
		int k=3;
		boolean flag = false;
		for(int i=0; i<arr.length; ++i) {
			for(int j=i+1; j<arr.length; ++j) {
				if((arr[i] == arr[j]) && (Math.abs(i-j) <= k)) {
					flag = true;
				}
			}
		}if(flag == true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
