package javapractice;
import java.util.*;
public class TestOct17IsomorphicCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("String 1 : ");
		String str1 = s.nextLine();
		System.out.print("String 2 : ");
		String str2 = s.nextLine();
		s.close();
		boolean flag = true;
		if(str1 == null || str2 == null || str1.length() != str2.length()) {
			flag = false;
		}
		HashMap<Character, Character> datamap = new HashMap<>();
		for(int i=0; i<str1.length(); i++) {
			char a = str1.charAt(i), b = str2.charAt(i);
			if(datamap.containsKey(a)) {
				if(datamap.get(a) != b) {
					flag = false;
				}
			}
			else {
				datamap.put(a, b);
			}
		}
//		return true;
		System.out.println(flag);
	
}

}