package avaliacao1;

import java.util.Scanner;

//Crie uma calculadora simples que permite ao usuário escolher
//entre soma, subtração, multiplicação ou divisão.
//O programa deve pedir dois números e realizar a operação escolhida. 

public class exercicio22 {
	public static void main(String[] args) {
		int n1, n2, soma, subtração, multiplicação, divisão;
		String operação;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a operação que deseja realizar:");
		System.out.println("Soma:");
		System.out.println("Subtração:");
		System.out.println("multiplicação:");
		System.out.println("Divisão:");
		operação = sc.next();

		System.out.println("Informe o número 1");
		n1 = sc.nextInt();
		System.out.println("Informe o número 2");
		n2 = sc.nextInt();

		if (operação.equals("soma")) {
			soma = n1 + n2;
			System.out.println("O resultado da soma: " + soma + "!");
		} else if (operação.equals("multiplicação")) {
			multiplicação = n1 * n2;
			System.out.println("O resultado da multiplicação: " + multiplicação + "!");

		} else if (operação.equals("Subtração")) {
			subtração = n1 - n2;
			System.out.println("O resultado da subtração: " + subtração + "!");

		} else {
			divisão = n1 / n2;
			System.out.println("O resultado da divisão: " + divisão + "!");
		}
	}
}
