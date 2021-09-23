package javapractice;

public class Users {
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentEmailId;
	private long studentPhoneNumber;

//-----------------------------------------------------------------------------------------------------------------------	
//	             using setter 
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	
	public void setStudentPhoneNumber(long studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	
//-----------------------------------------------------------------------------------------------------------------------	
//	            using getter
	

	public int  getStudentId() {
		return this.studentId;
	}
	
	public String  getStudentFirstName() {
		return this.studentFirstName;
	}
	
	public String  getStudentLastName() {
		return this.studentLastName;
	}
	
	public String  getStudentEmailId() {
		return this.studentEmailId;
	}
	
	public long  getStudentPhoneNumber() {
		return this.studentPhoneNumber;
	}
	
//-----------------------------------------------------------------------------------------------------------------------	

}
