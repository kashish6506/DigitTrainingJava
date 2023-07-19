package com.digit.testProj.pl;

import java.util.Scanner;

////////////Nested Exceptions///////////////////


class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your age is less  than 18";
	}
}
class OverAgeException extends Exception {
	public String getMessage() {
		return "Your age is above 60";
	}
}
class Candidate1 {
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age =sc.nextInt();
	}
	void getverify() throws Exception {
		if(age<18) {
			UnderAgeException uae= new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>18) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Issue the License");
		}
		
	}
}
class RTOO{
	void grantLicense(Candidate1 c) {
		try {
			c.getData();
			c.getverify();
		}
		catch (Exception e1) {
			// TODO: handle exception
			try {
				c.getData();
				c.getverify();
			}
			catch (Exception e2) {
				// TODO: handle exception
				try {
					c.getData();
					c.getverify();
				}
				catch (Exception e3) {
					// TODO: handle exception
					System.out.println("Go home.U have crossed the limits");
				}
			}
		}
	}
}
public class NestedException {
	public static void main(String[] args) {
		Candidate1 c1 = new Candidate1();
		RTOO rto = new RTOO();
		rto.grantLicense(c1);
	}
}
