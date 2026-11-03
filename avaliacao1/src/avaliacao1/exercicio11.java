package avaliacao1;

import java.util.Scanner;

//Se for triângulo válido, 
//diga se é equilátero, isósceles ou escaleno.

// Equilátero - Tem 3 lados iguais.
// Isósceles - Tem 2 lados iguais e 1 diferente.
//Escaleno - Tem 3 lados diferentes.

public class exercicio11 {
	public static void main(String[] args) {
		int lado1, lado2, lado3, soma1, soma2, soma3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o lado1 do triangulo");
		lado1 = sc.nextInt();
		System.out.println("Informe o lado2 do triangulo");
		lado2 = sc.nextInt();
		System.out.println("Informe o lado3 do triangulo");
		lado3 = sc.nextInt();
		
		soma1 = lado1 + lado2;
		soma2 = lado2 + lado3;
		soma3 = lado3 + lado1;
		
		if (soma1 > lado3 && soma2 > lado1 && soma3 > lado2) {
			System.out.println("Triangulo valido");
			if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triangulo Escaleno");
			}else if (lado1 != lado2 && (lado2 == lado3) || lado2 != lado3 && (lado3 == lado1) || lado3 != lado1 && (lado3 == lado2)) {
				System.out.println("Triangulo Isosceles");
			}else {
				System.out.println("Triangulo Equilátero");
				}
		}else {
			System.out.println("Triangulo invalido");
		}
	}

}	
