package javapractice;

public class InClass1Q3 {
	public static void main(String[] args) {
		int x = 5;
		int y = 9;
		if((x&y) > 10 && (x&y) < 20) {
			System.out.println("between 10 and 20");
		}
		else {
			System.out.println((x&y));
		}
		if((x|y) > 11  && (x|y)  < 20) {
			System.out.println((x|y));
		}
	}

}
