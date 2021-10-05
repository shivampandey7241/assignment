package javapractice;

public class Merge2SortedArrays {

	public static void main(String[] args) {
//		 Merge two sorted arrays
//		    array1 - 4,5,6,7,8
//		    array2 - 1,2,3,4
//		    o/p- 1,2,3,4,4,5,6,7,8
		int arr1[]= {4,5,6,7,8};
		int arr2[]= {1,2,3,4};
		int len = arr2.length + arr1.length;
		int mergearr [] = new int[len];
		
//--------------------------------------------------------
		
		for(int i =0; i<arr2.length; ++i) {
			mergearr[i] = arr2[i];
		}
		for(int i =0; i<arr1.length; ++i) {
			mergearr[arr2.length + i] = arr1[i];
		}
		for(int i =0; i<len; ++i) {
			System.out.print(mergearr[i]+" ");
		}
	}

}
