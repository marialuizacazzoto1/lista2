package avaliacao1;
//Peça a idade de uma pessoa e diga se o voto é 
//obrigatório (entre 18 e 70 anos). 

import java.util.Scanner;

public class exercicio9 {
	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sua idade");
		idade = sc.nextInt(); 	
		 if (idade >= 18 &&  idade <= 70) {	          
			System.out.println("O voto é obrigatorio ");
   }else { 
			System.out.println("O voto não é obrigatorio");
  }
 }
}
