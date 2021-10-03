package javapractice;
//inspired by m-ali code
public class InClass30 {
	public static void main(String[] args) {
		int norep = 0;
		int arr[] = {1,2,2,1,3,4,4,5,5};
		for(int i =0; i < arr.length; ++i) {
			norep = norep^arr[i];
		}System.out.println("Non repeating number :  "+norep);

	}
}
