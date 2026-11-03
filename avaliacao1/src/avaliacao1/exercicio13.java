package avaliacao1;
//Leia três números e mostre-os em ordem crescente (sem usar sort).

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		int num1,num2,num3, primeiro, segundo, terceiro;
	Scanner sc = new Scanner (System.in);
	System.out.println("Informe o número 1");
	num1 = sc.nextInt();
	System.out.println("Informe o número 2");
	num2 = sc.nextInt();
	System.out.println("Informe o número 3");
	num3 = sc.nextInt();
	
	if (num1 < num2 && num1 < num3) {
		primeiro = num1;
		} else if (num2 < num1 && num2 < num3) {
			primeiro = num2;
		}else {
			primeiro = num3;
	}
	
	if (num1 > num2 && num1 > num3) {
		segundo = num2;
		} else if 
		(num2 > num3 && num2 > num1) {
		segundo = num1;
		} else {
		segundo = num3;
		}
	
	if (num1 > num2 && num1 > num3) {
		terceiro = num1;
		} else if 
		(num2 > num1 && num2 > num3) {
		terceiro = num2;
		} else {
		terceiro = num3;
		}
	
	System.out.println(primeiro);
	System.out.println(segundo);
	System.out.println(terceiro);

}
}