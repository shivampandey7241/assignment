package javapractice;
import java.util.*;
public class TestOct17RemoveDuplicateAdjacentChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("String : ");
		String str = s.nextLine();
		s.close();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(!stack.isEmpty() && str.charAt(i) == stack.peek()) {
				stack.pop();
				sb.setLength(sb.length() - 1);
			}
			else {
				stack.push(str.charAt(i));
				sb.append(str.charAt(i));
			}
		}
		System.out.print(sb.toString());
	}

}
