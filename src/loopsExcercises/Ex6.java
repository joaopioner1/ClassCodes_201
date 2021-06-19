package loopsExcercises;

public class Ex6 {

	public static void main(String[] args) {
		// Author: Joao Vitor Souza Pioner | Date: 19/06/2021
		
		String let = "";
		for (int i = 1; i <= 10; i++) {
			System.out.println(let += "*");
		}
		System.out.println("---------------");
		for (int j = 0; j <= 10; j++) {
			String str = let.substring(j);
			System.out.println(str);
		}
		
	}

}
