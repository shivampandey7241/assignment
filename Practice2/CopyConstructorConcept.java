package javapractice;

public class CopyConstructorConcept {
	public int a;
	public String b;
	public String c ;
	
	public CopyConstructorConcept(String b1) {
		this.b = b1;
	}
	
	public CopyConstructorConcept(int a1) {
		this.a = a1;
	}
	
	public CopyConstructorConcept(CopyConstructorConcept aa, CopyConstructorConcept bb, String c1) {
		this.a = aa.a;
		this.b = bb.b;
		this.c = c1;
	}
	public static void main(String[] args) {
		
		CopyConstructorConcept s = new CopyConstructorConcept("hello");
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.c);
		System.out.println("-----------------------------------------------");
		
		CopyConstructorConcept s1 = new CopyConstructorConcept(2);
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		System.out.println("-----------------------------------------------");
		CopyConstructorConcept s2 = new CopyConstructorConcept(s,s1,"shivam");
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s2.c);
		System.out.println("-----------------------------------------------");
		
		
	}
	

}
