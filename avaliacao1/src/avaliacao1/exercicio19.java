package avaliacao1;
/*Leia peso e altura e classifique o IMC como: 
Abaixo do peso (<18.5) 
Normal (18.5 a 24.9) 
Sobrepeso (25 a 29.9) 
Obesidade (30 ou mais)*/

import java.util.Scanner;

public class exercicio19 {
	public static void main(String[] args) {
		double peso, altura, imc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu peso");
		peso = sc.nextDouble();
		System.out.println("Informe a sua altura");
		altura = sc.nextDouble();
		imc = peso / (altura * altura);
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc > 18.5 && imc < 24.9) {
			System.out.println("Peso normal");
		} else if (imc > 25 && imc < 29.9) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}
	}
}
