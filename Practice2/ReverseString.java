package javapractice;
//                     I/P- Geekster is my class room O/P- room class my is Geekster 
public class ReverseString {
	public static void main(String[] args) {
		String str = "Geekster is my class room";
		String[] arrstr = str.split(" ");
		String output = "";
		for(int i = arrstr.length - 1; i>= 0; --i ) {
			output = output + arrstr[i] + " ";
		}
		System.out.println(output);
	}

}
