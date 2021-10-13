package javapractice;

public class InClass12OctQ1DivideStringMultyLine {
	public static void main(String[] args) {
		String str = "aaabbbccc";
		int num = 3;
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			if((i+1) % num == 0) {
				System.out.println();
			}
		}
		
	}

}
