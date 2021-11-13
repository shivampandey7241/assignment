package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Nov08ArrayListChange3rdElement {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		arrList.add("one");
		arrList.add("two");
		arrList.add("three");
		arrList.add("four");
		arrList.set(2, "change");
		for(String i : arrList) System.out.print(i+" ");
	}

}
