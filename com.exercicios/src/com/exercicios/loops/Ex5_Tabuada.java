package com.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		
		System.out.println("Informe o número para o qual deseja ver a tabuada: ");
		numero = scan.nextInt();
		
		for (int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
	}

}
