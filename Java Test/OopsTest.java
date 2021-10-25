package javapractice;

import java.util.Scanner;

 class Oct24OopsTest {
	public  String multiply(String a, String b) {
		String x[] = a.split(" ");
		String y[] = b.split(" ");
		int ar = Integer.parseInt(x[0]);
		int ai = Integer.parseInt(x[1]);
		int br = Integer.parseInt(y[0]);
		int bi = Integer.parseInt(y[1]);
		return(ar * br - ai * bi)+ " + " +"i"+(ar * bi + ai * br);
	}
	public String plus(String c, String d) {
		String x[] = c.split(" ");
		String y[] = d.split(" ");
		int ar = Integer.parseInt(x[0]);
		int ai = Integer.parseInt(x[1]);
		int br = Integer.parseInt(y[0]);
		int bi = Integer.parseInt(y[1]);
		return(ar + br)+ " + "+"i"+(ai + bi);
	}
}
public class OopsTest{
	 public static void main(String argc[]){
		 Scanner s = new Scanner(System.in);
		 System.out.println("First equation with space between a and i :");
	     String str1 = s.nextLine();
	     System.out.println("Second equation with space between a and i :");
	     String str2 = s.nextLine();
	     System.out.println("Enetr '1' : (a + ib) + (x + iy)");
	     System.out.println("Enetr '2' : (a + ib) * (x + iy)");
	     int num = s.nextInt();
	     s.close();
	     Oct24OopsTest oops = new Oct24OopsTest();
	     if(num == 1) {
	        System.out.println("Ans : "+oops.plus(str1, str2));
	     }
	     else if(num == 2) {
	        System.out.println("Ans : "+oops.multiply(str1, str2));
	     }
	       
	 }
}

