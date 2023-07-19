package com.digit.testProj.pl;

import java.util.Scanner;

class Exp{

	void function1() throws ArithmeticException 
	{ 
		try {
			System.out.println("Inside Function-1");
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the numerator");
			int num1= sc.nextInt();
			System.out.println("Enter Denominator");
			int den = sc.nextInt();

			int res = num1/den;
			System.out.println("Division result:"+res);
			System.out.println("Left Func-1");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception Handled in Function-1");
			throw e;
		}
		finally {
			System.out.println("Left Function-1");
		}

	}
}

public class Exception4 {
	public static void main(String[] args) throws Exception {
		try{
			System.out.println("Inside Main");

			Exp op = new Exp();
			op.function1();
			System.out.println("Left Main");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled in main");
		}
		finally {
			System.out.println("left main");
		}
	}

}
