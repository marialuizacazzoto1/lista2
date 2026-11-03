package avaliacao1;

import java.util.Scanner;

//Peça dois números e 
//informe qual é o maior. 
public class exercicio3 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número 1");
		n1 = sc.nextInt();
		System.out.println("Informe o número 2");
		n2 = sc.nextInt();
	if ( n1 > n2) {
		System.out.println("O número maior é: " +n1);
	}	else if (n2 > n1) {
}   else {
	    System.out.println("O número maior é: " +n2);
  } 
 }
}