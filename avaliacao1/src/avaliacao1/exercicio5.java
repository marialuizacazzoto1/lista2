package avaliacao1;

import java.util.Scanner;

//Peça a nota final do aluno e informe 
//se foi aprovado (nota ≥ 7) ou reprovado.
public class exercicio5 {
	public static void main(String[] args) {
		int n1,n2;
		double notaFinal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a nota 1");
		n1 = sc.nextInt();
		System.out.println("Informe a nota 2");
		n2 = sc.nextInt();
		notaFinal = (n1 + n2) / 2;
		if (notaFinal >=7) {
		  System.out.println("Aprovado");
   } else {
          System.out.println("Reprovado"); 	    
  }
 }
}
