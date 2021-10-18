package javapractice;
import java.util.*;
public class InClassOct15HashMap {
	public static void main(String[] args) {
		String str = "abcdefgabcdef";
		
		int len = str.length();
		HashMap<Character, Integer> dataMap = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(!dataMap.containsKey(str.charAt(i))) {
				dataMap.put(str.charAt(i), 1);
			}
			else if(dataMap.containsKey(str.charAt(i))) {
				Integer valueOfA = dataMap.get(str.charAt(i));
				valueOfA += 1;
				dataMap.put(str.charAt(i), valueOfA);
			}
		}
//		boolean flag = true;
		for(Character key : dataMap.keySet()) {
			if(dataMap.get(key) == 1) {
				System.out.println(key);
				break;
			}
		}
		
	
	}
}
