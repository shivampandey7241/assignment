package javapractice;

public class InClass12OctQ3SplitSpaces {
	public static void main(String[] args) {
		String str = "You need to remove spaces of this string";
		String  arr[] = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
