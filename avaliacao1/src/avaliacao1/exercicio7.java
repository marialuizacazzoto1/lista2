package avaliacao1;

import java.util.Scanner;

//Leia um número e informe se ele é múltiplo de 5. 

public class exercicio7 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		numero = sc.nextInt();
	
		if (numero % 5 == 0) {
			System.out.println("Esse número é multiplo de 5");
	  } else {
			System.out.println("Esse número não é multiplo de 5");
  }		
 }
}
