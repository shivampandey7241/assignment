package javapractice;

public class PatternSep20Ques1 {
	public static void main(String[] args) {
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
                int n = 5;
		for(int i = 0; i<n; ++i) {
//		System.out.println(1);
			for(int j = n-i; j>1; --j) {
				System.out.print(" ");
			}
			for (int x =0; x<=i; ++x) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}

}
