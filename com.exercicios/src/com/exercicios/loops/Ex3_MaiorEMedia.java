package com.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int soma = 0;
		int maior = 0;
		float media = 0F;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			if (numero > maior) maior = numero;
			
			count++;
		} while(count < 5);
		
		media = soma/count;
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);

	}

}
