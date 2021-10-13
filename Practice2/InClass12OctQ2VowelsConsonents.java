package javapractice;

public class InClass12OctQ2VowelsConsonents {
	public static void main(String[] args) {
		String ustr = "Hey! this is also, another simple question isn't it?";
		String str = ustr.toLowerCase();
		int v=0;                                   
		int c=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					v++;
				}
				else if(str.charAt(i) != ' ') {
					c++;
				}
			}
		}
		System.out.println("consonants : "+c+" vowels : "+v);
	}

}
