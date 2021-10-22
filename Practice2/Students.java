package javapractice;



public class Students {
//	      Data Members
	private String studentName;
	private int studentAge;
	private String studentGender;
	private int studentRollNum;
	private long studentPhone;
	private int studenTotalMarks;
	private String studentaddress;
	
	
//  Method 1 	
	public Students() {
		
	}
	
	
//	Method 2
	public Students(String name) {
		this.studentName = name;
	}
	
	
//	   Method 3
	public Students(String name, int age, String gender, int rollNum, long phone, int totalMarks, String address) {
		this.studentName = name;
		this.studentAge = age;
		this.studentGender = gender;
		this.studentRollNum = rollNum;
		this.studentPhone =  phone;
		this.studenTotalMarks = totalMarks;
		this.studentaddress = address;
	}
	
	
//	Method 4 CopyConstructor
	public Students(String name, Students age, String gender, int rollNum, long phone, Students totalMarks, Students address) {
		this.studentName = name;
		this.studentAge = age.studentAge;
		this.studentGender = gender;
		this.studentRollNum = rollNum;
		this.studentPhone =  phone;
		this.studenTotalMarks = totalMarks.studenTotalMarks;
		this.studentaddress = address.studentaddress;
	}
	
	
//	Method 5 Compare
	public static int compare(int v, int w, int x, int y, int z) {
		int arr[] = {v, w, x, y, z};
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	

	
	
//            Main Method
	public static void main(String[] args) {
//	        Showing Default Values		
		Students str = new Students();
		System.out.println(str.studentName);
		System.out.println(str.studentAge);
		System.out.println(str.studentGender);
		System.out.println(str.studentRollNum);
		System.out.println(str.studentPhone);
		System.out.println(str.studenTotalMarks);
		System.out.println(str.studentaddress);
		
		System.out.println("-----------------------------------------------------------");
		
//		    Parameterized Constructor
		Students str1 = new Students("Shivam Pandey", 23, "Male", 99, 8299101186l, 100, "UP");
		System.out.println(str1.studentName);
		System.out.println(str1.studentAge);
		System.out.println(str1.studentGender);
		System.out.println(str1.studentRollNum);
		System.out.println(str1.studentPhone);
		System.out.println(str1.studenTotalMarks);
		System.out.println(str1.studentaddress);
		
		System.out.println("-----------------------------------------------------------");
		
//		Only given one literal rest all default
		Students str2 = new Students("Sankalp Verma");
		System.out.println(str2.studentName);
		System.out.println(str2.studentAge);
		System.out.println(str2.studentGender);
		System.out.println(str2.studentRollNum);
		System.out.println(str2.studentPhone);
		System.out.println(str2.studenTotalMarks);
		System.out.println(str2.studentaddress);
		
//----------------------------------------------------------------------------------------------------
		
		String s1name = "Killua Zoldyck";
		int s1age = 15;
		String s1gender = "Male";
		final int s1rollnum = 01;
		long s1phone = 122345l;
		int s1totalmarks = 100;
		String s1address = "s1";
		Students s1 = new Students(s1name,s1age,s1gender,s1rollnum,s1phone,s1totalmarks,s1address);
		System.out.println(s1.studentName);
		System.out.println(s1.studentAge);
		System.out.println(s1.studentGender);
		System.out.println(s1.studentRollNum);
		System.out.println(s1.studentPhone);
		System.out.println(s1.studenTotalMarks);
		System.out.println(s1.studentaddress);
System.out.println("-------------------------------------------------------------------");		
		String s2name = "Naruto Uzamaki";
		int s2age = 20;
		String s2gender = "Male";
		final int s2rollnum = 02;
		long s2phone = 122345l;
		int s2totalmarks = 200;
		String s2address = "s2";
		Students s2 = new Students(s2name,s2age,s2gender,s2rollnum,s2phone,s2totalmarks,s2address);
		System.out.println(s2.studentName);
		System.out.println(s2.studentAge);
		System.out.println(s2.studentGender);
		System.out.println(s2.studentRollNum);
		System.out.println(s2.studentPhone);
		System.out.println(s2.studenTotalMarks);
		System.out.println(s2.studentaddress);
System.out.println("-------------------------------------------------------------------");		
		String s3name = "Light Yagami";
		int s3age = 15;
		String s3gender = "Male";
		final int s3rollnum = 01;
		long s3phone = 122345l;
		int s3totalmarks = 300;
		String s3address = "s3";
		Students s3 = new Students(s3name,s3age,s3gender,s3rollnum,s3phone,s3totalmarks,s3address);
		System.out.println(s3.studentName);
		System.out.println(s3.studentAge);
		System.out.println(s3.studentGender);
		System.out.println(s3.studentRollNum);
		System.out.println(s3.studentPhone);
		System.out.println(s3.studenTotalMarks);
		System.out.println(s3.studentaddress);
System.out.println("-------------------------------------------------------------------");		
		String s4name = "Edward Elric";
		int s4age = 15;
		String s4gender = "Male";
		final int s4rollnum = 01;
		long s4phone = 122345l;
		int s4totalmarks = 400;
		String s4address = "s4";
		Students s4 = new Students(s4name,s4age,s4gender,s4rollnum,s4phone,s4totalmarks,s4address);
		System.out.println(s4.studentName);
		System.out.println(s4.studentAge);
		System.out.println(s4.studentGender);
		System.out.println(s4.studentRollNum);
		System.out.println(s4.studentPhone);
		System.out.println(s4.studenTotalMarks);
		System.out.println(s4.studentaddress);
System.out.println("-------------------------------------------------------------------");	
		String s5name = "L Lawliet";
		int s5age = s4.studentAge;
		String s5gender = "Male";
		final int s5rollnum = 05;
		long s5phone = 122345l;
		int s5totalmarks = s2.studenTotalMarks;
		String s5address = s2.studentaddress;
		Students s5 = new Students(s5name,s5age,s5gender,s5rollnum,s5phone,s5totalmarks,s5address);
		System.out.println(s5.studentName);
		System.out.println(s5.studentAge);
		System.out.println(s5.studentGender);              //2nd student marks and address and                                                   
		System.out.println(s5.studentPhone);                 //copy the age of 4th student.
		System.out.println(s5.studentRollNum);
		System.out.println(s5.studenTotalMarks);
		System.out.println(s5.studentaddress);
		
      
       System.out.println("Topper Score = "+compare(s1.studenTotalMarks, s2.studenTotalMarks, s3.studenTotalMarks, s4.studenTotalMarks, s5.studenTotalMarks)+" marks");	

	}

}
