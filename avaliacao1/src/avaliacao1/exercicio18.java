package avaliacao1;
//Verifique se um ano é bissexto 
//(divisível por 4, mas não por 100,
//exceto se divisível por 400). 

import java.util.Scanner;

public class exercicio18 {
		public static void main(String[] args) {
		int ano;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		ano = sc.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("Ano bissexto");
	   }else {
		   System.out.println("Não é bissexto");
		}
		}

	}
