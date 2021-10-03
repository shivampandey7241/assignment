package javapractice;
import java.util.*;
public class InClass1Q2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int marks = scn.nextInt();
		scn.close();
		if(marks < 40) {
			System.out.println("failed");
		}
		else if(marks > 40 && marks < 60) {
			System.out.println("C grade");
		}
		else if(marks > 60 && marks < 80) {
			System.out.println("B grade");
		}
		else if(marks > 80 && marks < 90) {
			System.out.println("B grade");
		}
		else if(marks > 90) {
			System.out.println("A+");
		}
	}

}
