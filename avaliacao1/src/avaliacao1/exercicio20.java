package avaliacao1;
//Classifique um número em positivo ou negativo,
//par ou ímpar, e inteiro ou decimal. 

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		double numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero");
		numero = sc.nextDouble();

		if (numero > 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}
		if (numero % 2 == 0) {
			System.out.println("O numero é par");
		} else {
			System.out.println("O numero é impar");
		}
		if (numero % 1 == 0) {
			System.out.println("O número é inteiro");
		} else {
			System.out.println("O número é decimal");
		}
	}
}
