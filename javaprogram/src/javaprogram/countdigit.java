package javaprogram;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, num = 123456;

	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
		}

	}


