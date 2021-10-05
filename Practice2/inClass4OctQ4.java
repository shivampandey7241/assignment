package javapractice;

public class inClass4OctQ4 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,9,7,6,5};
		int arrcopy[] = new int[arr.length];
		for(int i=0; i<arr.length; ++i) {
			arrcopy[i] = arr[i];
		}for(int j=0; j<arrcopy.length; ++j) {
			System.out.print(arrcopy[j]+" ");
		}
	}

}
