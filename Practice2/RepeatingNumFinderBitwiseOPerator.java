package javapractice;

public class RepeatingNumFinderBitwiseOPerator {
	public static void main(String[] args) {
//		Find 2 non repeating element in an array using bitwise operator
//		I/p- [1,5,8,6,5,1,6,2]
//		O/p- 8,2
		int[]arr = {1,5,8,6,5,1,6,2};
		
//-----------------------------------------------------------------
		
		
		for(int i=0; i<arr.length; ++i) {                    //   --CONCEPT--
			int a = 0;                               //    if a^b != 0 means not repeating     
			for(int j =0; j<arr.length; ++j) {       //    if a^b == 0 means repeating
				if((arr[i]^arr[j])== 0 & i!=j) {     //    cauz XOR cancel-out same.
					a++;
				}
			}
			if(a==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
