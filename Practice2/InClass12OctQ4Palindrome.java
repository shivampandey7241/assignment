package javapractice;

public class InClass12OctQ4Palindrome {
	public static void main(String[] args) {
		String str = "121";
		int p1 = 0;
		int p2 = str.length() -1;
		boolean flag = true;
		while(p1<p2) {
			if(str.charAt(p1) != str.charAt(p2) ) {
				flag = false;
			}
			p1++;
			p2--;
		}
		System.out.println(flag);
	}

}
