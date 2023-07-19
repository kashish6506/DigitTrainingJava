package com.digit.testProj.pl;

import java.util.Scanner;

class Operation2 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("Printing")) {
			printing();
		}
		else {
			add();
		}
	}
	void banking() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Banking operation");
			System.out.println("Enter the account number");
			int acc = sc.nextInt();
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			System.out.println("Banking Completed");
			System.out.println("Printingcompleted");
	}
	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1= sc.nextInt();
		System.out.println("Enter number 2:");
		int num2 = sc.nextInt();
		int res = num1+num2;
		System.out.println("The result is"+ res);
		System.out.println("Addition completed");
		
	}
	void printing() {
		System.out.println("Printing Operation");
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi, Good Morning");
			Thread.sleep(3000);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Printing completed"); 
	}
}
public class Program7 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Operation2 op1 = new Operation2();
		op1.setName("Banking");
		op1.setPriority(3);
		Operation2 op2 = new Operation2();
		op2.setName("Printing");
		Operation2 op3 = new Operation2();
		op3.add();
		System.out.println("Main Mmethod Terminated");
		
	}

}
