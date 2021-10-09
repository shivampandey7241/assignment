package javapractice;

public class InClass9OctQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,2,1,3};
		int arr2[] = {2,2,3};
		int ans[] = new int[9];
		for(int i=0 ;i<arr1.length; i++ ) {
			for(int j =0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					ans[i] = arr2[j];
				}
			}
		}
		for(int i=0; i<ans.length; i++) {
			if(ans[i] > 0 ) {
				System.out.print(ans[i]+" ");
			}
			
		}

	}

}
