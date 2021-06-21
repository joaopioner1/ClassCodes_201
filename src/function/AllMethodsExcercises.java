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
 * 1. Transforme o exerc�cio 3 de loops em uma fun��o que retorna o
n�mero de espa�os.
2. Fa�a uma fun��o que some dois n�meros (par�metros) e retorne o
resultado.
3. Fa�a uma que multiplique dois n�meros inteiros positivos
(par�metros), implemente a multiplica��o como um conjunto de
somas (para cada soma utilize a fun��o do exerc�cio anterior).
Exemplo: 3*4 = 3+3+3+3. N�o utilize o operador *.
4. Refa�a o exerc�cio anterior considerando n�meros inteiros
negativos e o zero.
-Crie testes para a fun��o.
5. Implemente a fun��o potencia que recebe dois par�metros (base e
expoente) considere o exponte como um n�mero natural e a base
como um n�mero inteiro. Fa�a a pot�ncia como um conjunto de
multiplica��es (Exemplo: 4� = 4*4*4). Utilize a fun��o de
multiplica��o do exerc�cio anterior.
-Crie testes para a fun��o. N�o se preocupe com o caso dos dois
par�metros serem igual a 0.
6. Crie uma fun��o maior que recebe dois n�meros inteiros e retorna
o maior.
-Crie testes para a fun��o.

7. Crie uma Fun��o mmc que recebe dois n�mero inteiros e retorna o
m�nimo multiplo comum. Dica, voc� poder� utilizar a fun��o maior
para sua l�gica da resposta.
-Crie testes para a fun��o;
 
*/