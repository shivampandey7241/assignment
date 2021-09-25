package javapractice;

public class Student {
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentEmailId;
	private String studentPhoneNumber;
	


	//	---------------------------------------------------------------------------
	public  Student() {
		this.studentId = 1;
		this.studentFirstName = "Shivam";
		this.studentLastName = "Pandey";
		this.studentEmailId = "shivampandey7241@gmail.com";
		this.studentPhoneNumber = "8299101186";
	}
	
//	---------------------------------------------------------------------------	
	public  Student(int studentId, String studentFirstName, String studentLastName,String studentEmailId, String studentPhoneNumber ) {
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmailId = studentEmailId;
		this.studentPhoneNumber = studentPhoneNumber;
	}
	
//	---------------------------------------------------------------------------	
	public void show() {
		System.out.println("student Id           : "+this.studentId);
		System.out.println("student First Name   : "+this.studentFirstName);
		System.out.println("student Last Name    : "+this.studentLastName);
		System.out.println("student Email Id     : "+this.studentEmailId);
		System.out.println("student Phone Number : "+this.studentPhoneNumber);
	}

}
