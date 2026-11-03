package avaliacao1;

import java.util.Scanner;

//Dado o valor da compra, aplique: 
//10% de desconto se for maior que R$500
//5% se for entre R$200 e R$500 
//nenhum desconto se for abaixo de R$200 

public class exercicio12 {
	public static void main(String[] args) {
		double  valor, desconto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da compra");
		valor = sc.nextDouble();
		if (valor > 500) {
			desconto = valor * 0.1;
			System.out.println("Valor do desconto " + desconto);
		} else if (valor >= 200 && valor <= 500) {
			desconto = valor * 0.05;
			System.out.println("valor do desconto " + desconto);
		} else {
			System.out.println("Nenhum desconto");
	}
		}

}
