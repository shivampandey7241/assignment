package javapractice;
import java.util.*;
public class CountMaxMinOccuranceOfChar {
	public static void main(String[] args) {
//		1.     "Tit for tat is a proverb"
//	    find min and max occurance of chars
//	    O/P-
//	    max->    T-4
//	    min->    F-1
		
		Scanner s = new Scanner(System.in);
		System.out.print("String : ");
		String str1 = s.nextLine();
		String str2 = str1.toLowerCase().replace(" ", "");
		s.close();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count =1;
		int maxi = 0;
		int mini = 0;
		
		for(int i=0; i<str2.length();i++) {
			for(int j=i+1;j<str2.length();j++) {
				if(str2.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
			if(count>max) {
				max = count;
				maxi = i;
			}
			if(count<min) {
				min = count;
				mini = i;
			}
			count =1;
		}
		System.out.println(max+" : "+str2.toUpperCase().charAt(maxi));
		System.out.println(mini+" : "+str2.toUpperCase().charAt(mini));
	}

}
