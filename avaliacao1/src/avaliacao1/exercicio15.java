package avaliacao1;
//Peça dois números e uma operação 
//(+, -, *, /). Execute a operação. 

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {
		int n1,n2, soma, menos, multiplicação, divisão;
		String operação;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número 1");
		n1 = sc.nextInt();
		System.out.println("Informe o número 2");
		n2 = sc.nextInt();
		
		System.out.println("Qual operação deseja realizar?");
		operação = sc.next();
		
		if (operação.equals("soma")) {
			soma = n1 + n2;
			System.out.println("O resultado da soma: " + soma + "!");
		} else if (operação.equals("multiplicação")) {
			multiplicação = n1 * n2;
			System.out.println("O resultado da multiplicação: " + multiplicação + "!");
			
		} else if  (operação.equals("menos")) {
			menos = n1 - n2;
			System.out.println("O resultado da subtração: " + menos + "!");
			
		}else {
			divisão = n1 / n2;
			System.out.println("O resultado da divisão: " + divisão + "!");
			}
}
}


