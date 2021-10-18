package javapractice;
import java.util.*;
public class TestOct17ReverseWorldInString {
	
//           	REVERSE WORLD IN STRING
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("String : ");             //Hello World
		String str = s.nextLine();
		String arr[] = str.split(" ");
		s.close();
		String rev1 = "";
		for(int i=0;i<arr.length;++i) {
			String temp = arr[i];
			String rev2 = "";
			for(int j=temp.length()-1; j>=0; --j) {
				rev2 += temp.charAt(j);
			}
			rev1 += rev2+" ";
		}
		System.out.print(rev1);
	}
}
