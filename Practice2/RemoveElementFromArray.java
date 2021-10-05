package javapractice;

public class RemoveElementFromArray {
	public static void main(String[] args) {
//		  Array- 1,2,4,5,7    k = 5
//				    O/P- 1,2,4,7
//				    Remove an element from an array
		int arr[]= {1,2,4,5,7};
		int k =5;
		int len = arr.length;
		int a = len-1;
//-------------------------------------------------------
		for(int i=0; i<len; ++i) {
			if(arr[i]==k) {
				continue;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
