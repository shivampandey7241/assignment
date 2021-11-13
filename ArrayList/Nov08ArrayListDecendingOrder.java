package javapractice;
import java.util.*;
public class Nov08ArrayListDecendingOrder {
	public static void main(String[] args) {
		int arr[] = {8,9,4,6,7,3,1,0,5,9,10,45,63};
		List<Integer> arrList = new ArrayList<>();
//      bubble--sort
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		for(int i=0; i<n; i++) {
			arrList.add(arr[i]);
		}for(int i : arr) System.out.print(i+" ");
    }

}
