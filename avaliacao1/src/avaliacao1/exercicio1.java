package avaliacao1;

import java.util.Scanner;

//Peça um número inteiro e 
//informe se ele é par ou ímpar. 

public class exercicio1 { 
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Informe um numero");
		numero = sc.nextInt();
	if (numero % 2 == 0) {
		System.out.println("O numero é par");	
    } 
	else {
       System.out.println("O numero é impar");
	}
}
}
