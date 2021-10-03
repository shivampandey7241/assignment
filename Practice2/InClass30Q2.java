package javapractice;
//missing number only for 1 number only
public class InClass30Q2 {
	public static void main(String[] args) {       //logic apply here is just xor the old arr of
		int arr [] = {2,0,1,3,4,6};                //missing number with new array of not missing 
		int newarr[] = new int[7];                 //number.
		int fxor = 0;                              
		int sxor = 0;
		
//------------------------------------------------------------------------		
		for(int i=0; i<arr.length; ++i) {
			fxor = fxor^arr[i];
		}
		for(int i=0; i<7; ++i) {
			newarr[i] = i;                        // we can also reduce the step
		}
		for(int i=0; i<newarr.length; ++i) {
			sxor = sxor^newarr[i];
		}
		int f = fxor^sxor;
		System.out.println("Missing number is "+f);
	}

}
