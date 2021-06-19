package loopsExcercises;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 18/06/2021
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter word/sentence: ");
		String string = sc.nextLine();
		
		String[] nulos = {"a", "e", "o", "i", "u"};

		for (String n:nulos) {
			string = string.replaceAll(n, "*");
		}
		System.out.println(string);
		sc.close();
	}

}
