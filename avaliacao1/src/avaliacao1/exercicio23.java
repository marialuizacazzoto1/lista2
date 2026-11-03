package avaliacao1;

import java.util.Scanner;

//Crie um programa onde o usuário deve escolher um tipo de transporte 
//(1 - Carro, 2 - Bicicleta, 3 - Ônibus, 4 - Avião) e o programa exibe
//a velocidade média do transporte escolhido.

public class exercicio23 {
	public static void main(String[] args) {
		int transporte;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um tipo de transporte");
		System.out.println("1 - Carro");
		System.out.println("2 - Bicicleta");
		System.out.println("3 - Ônibus");
		System.out.println("4 - Avião");
		transporte = sc.nextInt();

		if (transporte == 1) {
			System.out.println("Opção de transporte escolhido");
			System.out.println("Carro");
			System.out.println("Velocidade de 80 km/h");

		} else if (transporte == 2) {
			System.out.println("Opção de transporte escolhido");
			System.out.println("Bicicleta");
			System.out.println("Velocidade de 20 km/h");

		} else if (transporte == 3) {
			System.out.println("Opção de transporte escolhido");
			System.out.println("Ônibus");
			System.out.println("Velocidade de 60 km/h");
		} else {
			System.out.println("Opção de transporte escolhido");
			System.out.println("Avião");
			System.out.println("Velocidade de 900 km/h");

		}
	}
}
