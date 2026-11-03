package avaliacao1;

import java.util.Scanner;

//Implemente um programa onde o usuário escolhe uma figura geométrica
//(1 - Círculo, 2 - Quadrado, 3 - Retângulo) e o programa pede as medidas
//necessárias para calcular a área da figura escolhida. 

public class exercicio25 {
	public static void main(String[] args) {
		int figuraGeométrica;
		double area, raio, lado, base, altura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma figura geométrica");
		System.out.println("1 - Círculo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Retângulo");
		figuraGeométrica = sc.nextInt();

		if (figuraGeométrica == 1) {
			System.out.println("Figura geométrica escolhida");
			System.out.println("Círculo");
			System.out.println("Informe o raio do criculo");
			raio = sc.nextDouble();
			area = 3.14 * raio * raio;
			System.out.println("A area do circulo é: " + area);

		} else if (figuraGeométrica == 2) {
			System.out.println("Figura geométrica escolhida");
			System.out.println("Quadrado");
			System.out.println("Informe o lado");
			lado = sc.nextDouble();
			area = lado * lado;
			System.out.println("A area do quadrado é: " + area);

		} else {
			System.out.println("Figura geométrica escolhida");
			System.out.println("Retângulo");
			System.out.println("Informe a base e altura");
			base = sc.nextDouble();
			altura = sc.nextDouble();
			area = base * altura;
			System.out.println("A area do retangulo é: " + area);

		}
	}
}