package javapractice;
import java.util.*;
public class InClassOct15HashMapQ2 {
	public static void main(String[] args) {
		String str = "abcdefabcdef";
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
		if(dataMap.containsValue(1)) {
			System.out.println("yes");
			
		}
		
	}

}
