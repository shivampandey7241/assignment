package javapractice;

public class InClass9OctQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		int k=0;
			for(int j = arr1.length-1; j>=0; j--) {
				arr2[k++]=arr1[j];
			}
			
		for(int i=0; i<arr2.length; ++i) {
			System.out.print(arr2[i]+" ");
		}

	}

}
