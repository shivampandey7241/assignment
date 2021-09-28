package javapractice;
import java.util.*;
public class AreaCircumferenceCircle {
	public static void areaCircumference(String str, int r) {
		if(str.equals("area")) {
			System.out.println("area of a circle is : "+ (3.14f * r*r) );
		}
		else if (str.equals("circumference")) {
			System.out.println("Circumference of a circle is : "+ (2 * 3.14f * r) );
		}
		else {
			System.out.println("You enter wrong input");
		}
	}
//--------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Type area to find Area of a circle");
		System.out.println("Type circumference to find Circumference of a circle");
		String str = scn.nextLine();
		System.out.print("Enter the Radius od a circle : ");
		int r = scn.nextInt();
		scn.close();
		System.out.print("The "+str+ " of a circle with "+r+ "is : ");
		areaCircumference(str , r);
	}

}
