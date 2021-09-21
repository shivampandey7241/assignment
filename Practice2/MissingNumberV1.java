package javapractice;

public class MissingNumberV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		missing number is 6
		int[] arr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
		
//		find this solution on yt
		int n = arr.length +1;
//		System.out.println(n);
		int sum = n*(n+1)/2;
//		System.out.println(sum);
		for(int i = 0; i< arr.length; ++i) {
			sum = sum -arr[i];
		}
		System.out.println("missing number is "+sum);
	}

}
