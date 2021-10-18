package leetcode;

public class Palindrome {
//	An integer is a palindromewhen it reads the same 
//	backward as forward. For example, 121 is palindrome 
//	while 123 is not.
	
	 public static boolean isPalindrome(int x) {
	        String str = String.valueOf(x);
	        int j= str.length() - 1;
	        if(x<0) {
	        	return false;
	        }
	        else {
	        for(int i=0; i<str.length(); i++){
	            if(str.charAt(i) != str.charAt(j--)) {
	            	return false;
	            	
	            }
	      
	        }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
	}

}
