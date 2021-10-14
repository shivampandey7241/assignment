package javapractice;
import java.util.*;
public class HashMapConcept2 {
    public static void main(String[] args) {
    	String str = "aaabbbcccddeeeffffksacd";
		String low = str.toLowerCase().replace(" ", "");
		int len = low.length();
//---------------------------------------------------------------		
		HashMap<Character, Integer> dataMap = new HashMap<>();
//---------------------------------------------------------------		
		for(int i=0; i<len; i++) {
			if(!dataMap.containsKey(low.charAt(i))) {
				dataMap.put(low.charAt(i), 1);
			}
			else if(dataMap.containsKey(low.charAt(i))) {
				Integer valueOfA = dataMap.get(low.charAt(i));
				valueOfA += 1;
				dataMap.put(low.charAt(i), valueOfA);
			}
		}
//--------------------------------------------------------------		
		for(Character key : dataMap.keySet()) {
			System.out.println(key+" = "+dataMap.get(key));
		}
    }
}
