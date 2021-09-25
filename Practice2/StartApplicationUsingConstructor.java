package javapractice;

import java.util.Scanner;

public class StartApplicationUsingConstructor {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//-------------------------------------------------------------------------------------------------------------
		
		System.out.println("================================================================");
		System.out.print("Enter Student Id : ");
		int studentId = scn.nextInt();
		System.out.println("================================================================");
		String studentFirstNamee = scn.nextLine();       // to clear space.
		System.out.print("Enter Student First Name : ");
		String studentFirstName = scn.nextLine();
		System.out.println("================================================================");
		System.out.print("Enter Student Last Name : ");
	    String studentLastName = scn.nextLine();
	    System.out.println("================================================================");
	    System.out.print("Enter Student Email Id : ");
		String studentEmailId = scn.nextLine();
		System.out.println("================================================================");
		System.out.print("Enter Student Phone Number : ");
		String studentPhoneNumber = scn.nextLine();
		System.out.println("================================================================");
		
//----------------------------------------------------------------------------------------------
		
//		                                   ---Default---
		
		Student app1 = new Student();
		app1.show();
//----------------------------------------------------------------------------------------------
		
//		                                  ---Parameterized---
		
		Student app2 = new Student(studentId, studentFirstName, studentLastName, studentEmailId, studentPhoneNumber ) ;
		app2.show();
		scn.close();
	}

}
