package com.digit.testProj.pl;

import java.util.Scanner;

class Operations{
	
void function1() throws Exception 
{
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
void function2() throws Exception {
	 System.out.println("Inside Func-2");
	 function1();
	 System.out.println("Left Func-2");
}
void function3() {
	try {
		System.out.println("Inside function-3");
		function2();
	}
	catch (Exception e){
		System.out.println("Exception Handled");
	}
	System.out.println("Left Function-3");
	 
}
}


public class Program3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Inside Main");
		Operations op = new Operations();
		op.function3();
		System.out.println("Left Main");
	}

}
