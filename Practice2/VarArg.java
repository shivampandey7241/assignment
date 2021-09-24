package javapractice;

public class VarArg {
	public static Integer sumof(int a, int b, int...z) {     //   using Varags.
	    int sum = 0;
	    for(int i = 0; i<z.length; ++i){
	        sum = sum + z[i];
	        }return a + b + sum;
	}
	
// 	---------------------------------------------------------------------------
                                    //   main method

	public static void main (String[] args) {
	   int a = 5;
	   int b = 6;
	   //int c = 1,1,2;
	   System.out.println("sum of 5 + 6 + 1 + 4 + 5 + 1 = "+sumof(a,b,1,4,5,1));
	}

}
