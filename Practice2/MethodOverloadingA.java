package javapractice;

public class MethodOverloadingA {
	public static void main(String[] args) {
		
//		className + call-mathod which is in this case "sumOf" + giving value		
		
		MethodOverloadingB.sumOf(4, 4);       
//	----------------------------------------	
		MethodOverloadingB.sumOf(4, 4, 4);
//	----------------------------------------
		MethodOverloadingB.sumOf(4.0, 4.6);
//	----------------------------------------
	}

}
