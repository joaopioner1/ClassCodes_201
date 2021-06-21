package loopsExcercises;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 20/06/2021
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines (1-19): ");
		int lines = sc.nextInt();
		
		String string = "", str, teste = "";
		String empty = "";
		
		for (int i = 1; i <= lines; i++) {
			empty += " ";
		}
		
		for (int i = 1; i <= lines; i++) {
			string += "*";
			
			str = empty.substring(i);
			System.out.println(str + string + teste);
			teste += string;
		}
		
		
		/*for (int i = 1; i <= lines; i++) {
			string += "*";
			str = empty.substring(i);
			System.out.println(str + string);
		}*/
		sc.close();
	}

}
