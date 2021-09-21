package javapractice;

public class MissingNumberV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		done by my-self
		int[] arr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
		int sum = 0;
		for(int i =1; i<=15; ++i) {
			sum += i; 
		}System.out.println(sum);
		
		
		for(int i =0; i < arr.length; ++i ) {
			sum= sum - arr[i];
		}System.out.println(sum);

	}

}
