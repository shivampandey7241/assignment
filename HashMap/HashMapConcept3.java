package javapractice;

import java.util.*;

public class HashMapConcept3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashMap<Integer, String> dataMap = new HashMap<>();
		for(int i=1; i<=5; i++) {
		    System.out.print("Enter Your Name : ");
			dataMap.put(i, s.nextLine());
		}
		s.close();
		for(int i : dataMap.keySet()) {
			System.out.println("Key-"+i+"   Value-"+dataMap.get(i));
		}
		
	}

}
