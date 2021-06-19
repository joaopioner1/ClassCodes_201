package loopsExcercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.NegativeNumberException;

public class Ex1 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 16/06/2021
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.print("Enter a positive number: ");
		Integer number = in.nextInt();
		checkNumber(number);
		try {
			for (int i = 0; i <= number; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("ERROR: you must enter a positive number!");
		}
		
		in.close();
	}
	
	public static void checkNumber(Integer number) {
		if (number < 0) {
			throw new NegativeNumberException("THE NUMBER MUST BE POSITIVE!!!");
		}
	}
}
