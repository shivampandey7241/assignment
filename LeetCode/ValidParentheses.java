package leetcode;
import java.util.*;
public class ValidParentheses {
	 public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			else if((s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') && stack.isEmpty()) {
				return false;
			}
			else if(s.charAt(i) == ')'  && stack.peek() == '(') {
				stack.pop();
			}
			else if(s.charAt(i) == '}'  && stack.peek() == '{') {
				stack.pop();
			}
			else if(s.charAt(i) == ']'  && stack.peek() == '[') {
				stack.pop();
			}
			else {
				return false;
			} 
		}
		if(stack.size() == 0) {
            return true;
        }
        else {
            return false;
        }  
	 }
     public static void main(String[] args) {
    	 String s = "(){}[]";
		System.out.println(isValid(s));
	}
}
