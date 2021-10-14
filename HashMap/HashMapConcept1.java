package javapractice;
import java.util.*;
public class HashMapConcept1 {
	public static void main(String[] args) {
		String str = "Tit for tat is a proverb";
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
//---------------------------------------------------------------		
//		System.out.println(dataMap);
//---------------------------------------------------------------
		int max = 0;
		char maxChar = 0 ;
		int min = 1;
		char minChar = 0;
		for(Character key : dataMap.keySet()) {
			
			if(max < dataMap.get(key)) {
				max = dataMap.get(key);
				maxChar = key;
			}
			if(min >= dataMap.get(key)) {
				min = dataMap.get(key);
				minChar = key;
			}
		}
		System.out.println("Max Char Occurance : "+maxChar+" Times : "+max);
		System.out.println("Min Char Occurance : "+minChar+" Times : "+min);
	}

}
