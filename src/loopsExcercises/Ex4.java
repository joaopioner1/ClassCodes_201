package loopsExcercises;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 18/06/2021
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter word/sentence: ");
		String string = sc.nextLine();
		
		System.out.println("--------\nString upper case: "+string.toUpperCase());
		
		sc.close();
	}
}
