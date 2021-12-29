package com.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int q;
		int count = 0;
		int numero = 0;
		int par = 0;
		int impar = 0;
		
		System.out.println("Informe a quantidade de números: ");
		q = scan.nextInt();
		
		do {
			System.out.println("Insira um número: ");
			numero = scan.nextInt();
			if (numero%2 == 0) par++;
			else impar++;
			count++;
		} while (count < q);
		
		System.out.println("Quant Numeros Pares: " + par);
		System.out.println("Quant Numeros Ímpares: " + impar);
		

	}
}
