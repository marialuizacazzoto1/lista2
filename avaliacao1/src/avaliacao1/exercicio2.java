package avaliacao1;

import java.util.Scanner;

//Leia um número e informe se 
//ele é positivo, negativo ou zero. 
public class exercicio2 {
	public static void main(String[] args) {
		int numero, positivo, negativo, zero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um número");
		numero = sc.nextInt();
		if (numero == 0) { 
			System.out.println("O número é zero");
			} else if (numero > 0) {
				System.out.println("O número é positivo");
			} else {
				System.out.println("O número é negativo");
	
		
	}	

}
}