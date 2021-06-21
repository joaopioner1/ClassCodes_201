package function;

import java.util.Scanner;

public class AllMethodsExcercises {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 21/06/2021
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word/sentence: ");
		String string = sc.nextLine();
		System.out.println("A string possui: " + numberEspaces(string) + " espacos\n----------------");
		
		System.out.print("Enter 2 numbers: ");
		Double n1 = sc.nextDouble();
		Double n2 = sc.nextDouble();
		System.out.println("Sum: " + String.format("%.2f", sum(n1,n2)) + "\n----------------");

		System.out.print("Enter 2 numbers: ");
		Integer n3 = sc.nextInt();
		Integer n4 = sc.nextInt();
		System.out.println("Mul: " + mul(n3, n4) + "\n----------------");
		
		sc.close();
	}
	
	static Integer numberEspaces(String word) {
		Integer count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				count += 1;
			}
		}
		return count;
	}
	
	static Double sum(Double n1, Double n2) {
		return n1 + n2;
	}
	
	static Integer mul(Integer n1, Integer n2) {
		int count = 0;
		for (int i = 1; i <= n2; i++) {
			count += n1;
		}
		return count;
	}
}
/*
 * 1. Transforme o exercício 3 de loops em uma função que retorna o
número de espaços.
2. Faça uma função que some dois números (parâmetros) e retorne o
resultado.
3. Faça uma que multiplique dois números inteiros positivos
(parâmetros), implemente a multiplicação como um conjunto de
somas (para cada soma utilize a função do exercício anterior).
Exemplo: 3*4 = 3+3+3+3. Não utilize o operador *.
4. Refaça o exercício anterior considerando números inteiros
negativos e o zero.
-Crie testes para a função.
5. Implemente a função potencia que recebe dois parâmetros (base e
expoente) considere o exponte como um número natural e a base
como um número inteiro. Faça a potência como um conjunto de
multiplicações (Exemplo: 4³ = 4*4*4). Utilize a função de
multiplicação do exercício anterior.
-Crie testes para a função. Não se preocupe com o caso dos dois
parâmetros serem igual a 0.
6. Crie uma função maior que recebe dois números inteiros e retorna
o maior.
-Crie testes para a função.

7. Crie uma Função mmc que recebe dois número inteiros e retorna o
mínimo multiplo comum. Dica, você poderá utilizar a função maior
para sua lógica da resposta.
-Crie testes para a função;
 
*/