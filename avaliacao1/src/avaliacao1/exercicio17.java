package avaliacao1;
//Informe se dois números têm a mesma paridade
//(ambos pares ou ambos ímpares). 

import java.util.Scanner;

public class exercicio17 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero 1");
		num1 = sc.nextInt();
		System.out.println("Informe o numero 2");
		num2 = sc.nextInt();

		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("Os numeros são pares");
		} else if (num1 % 2 != 0 && num2 % 2 != 0) {
			System.out.println("Os numeros são impares");
		} else {
			System.out.println("Os numeros não tem paridade");
		}
	}

}
