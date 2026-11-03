package avaliacao1;

import java.util.Scanner;

//Solicite a idade de uma pessoa e 
//diga se ela pode se aposentar (idade ≥ 65). 
public class exercicio6 {
	public static void main(String[] args) {
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sua idade");
		idade = sc.nextInt();
		if (idade > 65) {
			System.out.println("Aposenta");
	 } else {
		    System.out.println("Não aposenta");
  }
 }
}
