package com.digit.testProj.pl;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		int acc = sc.nextInt();
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
		System.out.println("Printing completed");
		
		for(int i=0;i<5;i++) {
			System.out.println("Hi, Good Morning");
			Thread.sleep(3000);
		}
		System.out.println("Printing completed");                                                                                                                                                                                                                                                     
		System.out.println("Enter number1:");
		int num1=sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		int res = num1+num2;
		System.out.println("The result is"+ res);
		System.out.println("Addition completed");
	}

}
