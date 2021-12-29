package com.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int fatorial=1;
		
		System.out.println("Insira o número para calcular o fatorial: ");
		numero = scan.nextInt();
		
		for (int i=numero; i>0; i--) {
			fatorial = fatorial*i;
		}
		System.out.println("Resultado: " + numero + "! = " + fatorial);

	}

}
