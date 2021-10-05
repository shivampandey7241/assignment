package javapractice;

//                 #simple

public class inClass4OctQ5 {
	public static void main(String[] args) {
		int arr[] = {1,4,6,7,86,3,2,5};
		int j=-1;
		int k= arr.length;
		int concat[] = new int[arr.length];
		
//----------------------------------------------------------------------		
		for(int i=0; i<arr.length; ++i) {
			if(arr[i] %2 ==0) {
				concat[++j] = arr[i];
			}
			if(arr[i]%2 != 0) {
				concat[--k] = arr[i];
			}
		}System.out.print("Even number are on left and odd are on right side : ");
		for(int i=0; i<arr.length; ++i) {
			System.out.print(concat[i]+" ");
		}
	}

}
