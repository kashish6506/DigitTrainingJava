package com.digit.testProj.pl;

import java.util.Scanner;

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
class Candidate {
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
class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.getverify();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled");
		}
	}
}
public class Program4 {
	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		RTO rto = new RTO();
		rto.grantLicense(c1);
	}

}
