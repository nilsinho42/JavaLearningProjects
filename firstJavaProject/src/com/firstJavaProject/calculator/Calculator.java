package com.firstJavaProject.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Input first number: ");
		a = scan.nextInt();
		System.out.println("Input second number: ");
		b = scan.nextInt();
		
		int sum = sum(a, b);
		int sub = sub(a, b);
		int mult = mult(a, b);
		int div = div(a, b);
		
		
		System.out.println("Sum a + b: " + sum);
		System.out.println("Sub a - b: " + sub);
		System.out.println("Mult a * b: " + mult);
		System.out.println("Div a / b: " + div);

	}

	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	public static int mult(int a, int b) {
		return a * b;
	}
	
}
