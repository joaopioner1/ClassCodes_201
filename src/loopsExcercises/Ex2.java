package loopsExcercises;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 18/06/2021
		Scanner sc = new Scanner(System.in);

		Integer chico = 150, ze = 110, anos = 0;

		while (chico >= ze) {
			anos += 1;
			ze += 4;
			chico += 2;
		}
		System.out.println("--------------");
		System.out.println("Ze sera mais velho depois de " + anos + " anos.");

		sc.close();
	}

}
