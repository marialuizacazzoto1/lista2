package avaliacao1;
/*Peça três números e informe se o terceiro é
igual ao primeiro ou ao segundo. */

import java.util.Scanner;

public class exercicio16 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número ");
		num2 = sc.nextInt();
		System.out.println("Informe o terceiro número");
		num3 = sc.nextInt();
		 if (num3 == num1 || num3 == num2) {
			 System.out.println("Numero igual ao terceiro encontrado");
		 } else {
			 System.out.println("Nenhum dos números é igual ao terceiro");

			
		}
	}

}
