package loopsExcercises;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 18/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer chico = 150, ze = 110, anos = 0;
		
		while (chico >= ze) {
			anos += 1;
			ze += 4;
			chico += 2;
		}
		System.out.println("Ze sera mais velho depois de " + anos + " anos.");
		
		sc.close();
	}

}
/*
 * Chico tem 1,50 metro e cresce 2 cent�metros por ano, enquanto Z� 
tem 1,10 metro e cresce 4 cent�metros por ano. Construa um 
algoritmo que calcule e imprima quantos anos ser�o necess�rios 
para que Z� seja maior que Chico.
 */
