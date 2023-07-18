package com.digit.testProj.pl;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		 try {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Division Operation");
			 System.out.println("Enter the numerator");
			 int num1= sc.nextInt();
			 System.out.println("Enter Denominator");
			 int den = sc.nextInt();
			 int res = num1/den;
			 System.out.println("Division result:"+res);
			 System.out.println("Array Operation");
			 System.out.println("Enter the array");
			 int n = sc.nextInt();
			 int arr[] = new int[n];
			 int arr1[] = null;
			 System.out.println("Enter the position to which u want to add data");
			 int pos = sc.nextInt();
			 System.out.println("Enter the value");
			 int val = sc.nextInt();
			 arr[pos]=val;
			 System.out.println("Data added into the array");
			 
		 }
		 catch(ArithmeticException e1){
			 System.out.println("ArithmeticException");
		 }
		 
		 catch(ArrayIndexOutOfBoundsException|NegativeArraySizeException e4) {
			 System.out.println("ArrayrelatedException");
		 }
		 catch(NullPointerException|InputMismatchException e5) {
			 System.out.println("InputrelatedException");
		 }
		 catch(Exception e) {
			 System.out.println("Exception handled by generic catch");
		 }
	}
}
