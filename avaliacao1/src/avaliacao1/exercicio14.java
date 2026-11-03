package avaliacao1;
/*Converta uma nota numérica (0 a 10) para conceitos: 
A (≥9),  
B (≥8),  
C (≥7),  
D (≥6),  
E (<6) */

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		double notas, conceitos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota numérica");
		notas = sc.nextDouble();

		if (notas >= 9) {
			System.out.println("Nota é 	A");

		} else if (notas >= 8) {
			System.out.println("Nota é 	B");

		} else if (notas >= 7) {
			System.out.println("Nota é 	C");

		} else if (notas >= 6) {

			System.out.println("Nota é 	D");

		} else {
			System.out.println("Nota é 	E");
		}

	}

}
