package javapractice;
import java.util.*;
public class Nov08ArrayListCopyFromOneToOther {
	public static void main(String[] args) {
		List<Integer> original = new ArrayList<>();
		List<Integer> copy = new ArrayList<>();
		original.add(15);
		original.add(9);
		original.add(19);
		original.add(98);
		for(int i=0; i<original.size(); i++) {
			copy.add(original.get(i));
		}
		for(int i : copy) System.out.print(i+" ");
	}

}
