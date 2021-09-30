package javapractice;
import java.util.Scanner;
public class NumberTimes {
	      public static void nonRepeat(int a[])
	      {
	         int count;
	         int n = a.length;
	         for(int i=0;i<n;++i)
	         {
	             count=0;
	             for (int j = 0; j < n; ++j)
	             {
	                if(a[i]==a[j] && i!=j)
	                       count++;
	             }
	             if(count==0)
	                System.out.print(a[i]+"  ");
	         }
	       }
	      
//---------------------------------------------------------------------------	      

	       public static void main(String[] args) 
	       {
	          Scanner scn = new Scanner(System.in);
	          System.out.print("enter length of an array : ");
	          int size=scn.nextInt();
	          int[] a=new int[size];
	          System.out.print("enter elements of an array : ");
	          for(int i=0;i<a.length;++i)
	          {
	               a[i] = scn.nextInt();
	          }
	          System.out.print("Non Repeating number in Array : ");
	          nonRepeat(a);
	          scn.close();
	       }
}
