package avaliacao1;

import java.util.Scanner;

//Solicite três lados e verifique se formam um triângulo válido. 
//(Soma de dois lados deve ser maior que o terceiro) 

public class exercicio10 {
	public static void main(String[] args) {
		int lado1, lado2, lado3, soma1, soma2, soma3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o lado1 do triangulo");
		lado1 = sc.nextInt();
		System.out.println("Informe o lado2 do triangulo");
		lado2 = sc.nextInt();
		System.out.println("Informe o lado3 do triangulo");
		lado3 = sc.nextInt();
		
		soma1 = lado1 + lado2;
		soma2 = lado2 + lado3;
		soma3 = lado3 + lado1;
		
		if (soma1 > lado3 && soma2 > lado1 && soma3 > lado2) {
			System.out.println("Triangulo valido");
		}else {
			System.out.println("Triangulo invalido");
		}
	}

}
