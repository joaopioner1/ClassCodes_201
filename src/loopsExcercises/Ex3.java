package loopsExcercises;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 18/06/2021
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word/sentence: ");
		String string = sc.nextLine();
		
		Integer count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				count += 1;
			}
		}
		System.out.println("A string possui: " + count + " espacos.");
		
		sc.close();
	}
}
/*Fa�a um algoritmo que l� uma String e conta quantos espa�os 
existem na String, ao fim imprima o resultado.*/