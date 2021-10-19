package leetcode;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
    	int j = 0;
    	for(int i=1; i<nums.length; i++) {
    		if(nums[j] != nums[i]) {
    			nums[++j] = nums[i];
    		}
    	}return j+1;	
     }
    public static void main(String[] args) {
		int arr[] = {3,3,4};
		 
		System.out.println(removeDuplicates(arr));
	}
}
