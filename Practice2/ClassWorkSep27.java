package javapractice;
import java.util.*;
public class ClassWorkSep27 {
	public static boolean validate(int a) {
		if(a < 18) {
			return true;
		}
		else{
			return false;
		}
	}
//-----------------------------------------------------
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a = s.nextInt();
		s.close();
		if(validate(a) == true) {
			System.out.println("Not eligiable");
		}
		else  if(validate(a) == false) {
			System.out.println("Eligiable");
		}
	}

}
