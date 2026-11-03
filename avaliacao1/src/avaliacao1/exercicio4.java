package avaliacao1;
//Solicite três números e 
//mostre qual é o maior. 

import java.util.Scanner;

public class exercicio4 {
		public static void main(String[] args) {
			int n1, n2, n3;
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o número 1");
			n1 = sc.nextInt();
			System.out.println("Informe o número 2");
			n2 = sc.nextInt();
			System.out.println("Informe o número 3");
			n3 = sc.nextInt();
		if ( n1 > n3) {
			System.out.println("O número maior é: " +n1);
		} else if (n3 > n1) {	
	}   else {
		    System.out.println("O número maior é: " +n3);
   } 
  }
 }
