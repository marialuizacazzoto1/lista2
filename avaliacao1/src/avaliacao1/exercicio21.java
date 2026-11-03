package avaliacao1;

import java.util.Scanner;

//Implemente um programa que exiba um menu com opções de café da manhã
//e o usuário deve escolher uma opção (1 - Pão com manteiga, 2 - Café com leite,
//3 - Suco de laranja, 4 - Omelete).
//O programa deve exibir a escolha feita.
public class exercicio21 {
	public static void main(String[] args) {
		int opçãoDEcafé;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção de café da manhã");
		System.out.println("1 - Pão com manteiga");
		System.out.println("2 - Café com leite");
		System.out.println("3 - Suco de laranja");
		System.out.println("4 - Omelete");
		opçãoDEcafé = sc.nextInt();
		
		if (opçãoDEcafé == 1) {
			System.out.println("Opção de café escolhida");
			System.out.println("Pão com manteiga");
			
		} else if (opçãoDEcafé == 2){
			System.out.println("Opção de café escolhida");
			System.out.println("Café com  leite");
		
		} else if (opçãoDEcafé == 3){
			System.out.println("Opção de café escolhida");
			System.out.println("Suco de laranja");
		} else {
			System.out.println("Opção de café escolhida");
			System.out.println("Omelete");
		
  }
 }
}