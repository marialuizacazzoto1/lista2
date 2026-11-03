package avaliacao1;

import java.util.Scanner;

//Verifique se um número é divisível ao 
//mesmo tempo por 3 e por 4. 

public class exercicio8 {
	public static void main(String[] args) {
	int numero;
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe um número");
	numero = sc.nextInt();
	
	if (numero % 3 == 0 && numero % 4 == 0 ) {
		System.out.println("Divisível por 3 e 4");
   }else {
	   System.out.println("Não é divisível por 3 e 4");
	}
	}

}
/* % → pega o resto da divisão.
== 0 → significa que não sobrou nada.
&& → significa E. */
