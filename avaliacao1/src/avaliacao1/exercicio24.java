package avaliacao1;

import java.util.Scanner;

//Crie um programa que converta um valor informado pelo 
//usuário de uma moeda para outras moedas 
//por exemplo: 1 - Dólar, 2 - Euro, 3 - Real). O programa
//deve mostrar o valor convertido com base na cotação atual.

public class exercicio24 {
	public static void main(String[] args) {
		int moeda;
		double valor, dolar, euro, real;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de moedas:");
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		moeda = sc.nextInt();

		if (moeda == 1) {
			System.out.println("Informa o valor");
			valor = sc.nextDouble();
			dolar = valor / 5.12;
			System.out.println("dolar: " + dolar );

		} else if (moeda == 2) {
			System.out.println("Informa o valor");
			valor = sc.nextDouble();
			euro = valor / 5.92;
			System.out.println("euro: " + euro );


		} else {
			System.out.println("Informa o valor");
			valor = sc.nextDouble();
			real = valor;
			System.out.println("real: " + real);

		}
	}

}
