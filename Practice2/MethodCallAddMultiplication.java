package javapractice;
import java.util.*;
public class MethodCallAddMultiplication {
	public static void addProd(String str, int a , int b) {
		if(str.equals("add")) {
			System.out.println("addition of two number is : "+ (a+b));
		}
		else if (str.equals("multiply")) {
			System.out.println("Multiplication of two number is : "+( a*b));
		}
	}
//-----------------------------------------------------------------------------------
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Type add for addition");
		System.out.println("Type multiply for multiplication");
		String str = scn.nextLine();
		System.out.print("Enter first number : ");
		int a = scn.nextInt();
		System.out.print("Enter second number : ");
		int b = scn.nextInt();
		scn.close();
		addProd(str, a, b);
	}
}
