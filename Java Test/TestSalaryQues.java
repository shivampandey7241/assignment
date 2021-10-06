package javapractice;
import java.util.*;
public class TestSalaryQues {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      Scanner s = new Scanner(System.in);
	      long basic = s.nextLong();
	      System.out.println("grade : ");
	      char grade = s.next().charAt(0);
	      s.close();
	      double hra = (double)(20*basic)/100;
	      double da = (double)(50*basic)/100;
	      double pf = (double)(11*basic)/100;
	      int allow=0;
	      if(grade == 'A'){
	        allow = 1700;
	      }
	      else if(grade == 'B'){
	        allow = 1500;
	      }
	      else{
	        allow = 1300;
	      }
	      double totalSalary =basic + hra + da + allow - pf;
	      System.out.println(Math.round(totalSalary));
	      
	    }

}
