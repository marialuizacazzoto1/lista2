package lista3;

import java.util.Random;
import java.util.Scanner;

public class forEwhile {

	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		ex1();

	}

	// Peça ao usuário para digitar caracteres um a um.
	// Quando ele digitar um ponto final (.)

	public static void ex1() {

		// variável para caractere digitado

		char caractere;

		// variável para contar

		int contador = 0;

		do {

			System.out.println("Digite um caractere");

			caractere = sc.next().charAt(0);

			contador++;

		} while (caractere != '.');

		System.out.printf("Foram digitados %d caracteres", --contador);

	}

	public static void ex2() {

//Peça uma palavra e conte quantas vogais ela contém 

//(sem usar array, apenas com repetição e charAt). 

		String palavra;

		int vogais = 0;

		System.out.println("Digite uma palavra");

		palavra = sc.next().toLowerCase();

		for (int i = 0; i < palavra.length(); i++) {

			char letra = palavra.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

				vogais++;

			}

		}

		System.out.printf("A palavra %s tem %d vogais", palavra, vogais);

	}

	public static void ex3() {
		// Peça uma palavra e um número n. Mostre a palavra
		// repetida n vezes, uma por linha.

		int numero;
		String palavra;

		System.out.println("Informe um número");
		numero = sc.nextInt();
		System.out.println("Informe uma palavra");
		palavra = sc.next();

		for (int i = 0; i < numero; i++) {

			System.out.printf("%s%n", palavra);

		}
	}

	public static void ex4() {
//Leia frases do usuário em loop. 
//Quando ele digitar "sair", o programa termina.

		String frase;

		do {
			System.out.println("Digite uma frase");
			frase = sc.nextLine();

		} while (!frase.equalsIgnoreCase("sair"));

		System.out.println("Programa terminou");
	}

	public static void ex5() {
//Continue pedindo um nome até que o usuário digite algo com pelo menos 3 letras.

		String nome;

		do {
			System.out.println("Digite um nome");
			nome = sc.nextLine();

		} while (nome.length() < 3);
		System.out.println("Nome válido!");
	}

	public static void ex6() {
//Solicite uma senha e peça confirmação até que ambas coincidam.

		String confirmar = "", senha = "";

		do {
			System.out.println("Informe sua senha");
			senha = sc.next();

			System.out.println("Confirme sua senha:");
			confirmar = sc.next();

		} while (!senha.equals(confirmar));

		System.out.printf("Senhas confirmadas com sucesso! %n");

	}

	public static void ex7() {
//Número fixo oculto. O usuário tem até 5 tentativas para adivinhar.

		int tentativa = 0, numero = 13, palpite = 0;

		while (numero != palpite && tentativa < 5) {
			System.out.println("Adivinhe o  número");
			palpite = sc.nextInt();
			tentativa++;

			if (palpite == numero) {
				System.out.printf("Você acertou!%n");

			}
			System.out.printf("tentativas restantes %d %n", -tentativa);
		}
	}

	public static void ex8() {

//Permita votar em três candidatos até que a palavra "fim" seja digitada. Conte os votos.

		int candidato1 = 0, candidato2 = 0, candidato3 = 0;
		String voto;

		do {
			System.out.println("Digite 1,2,3 ou fim");
			voto = sc.next();

			switch (voto) {
			case "1":
				candidato1++;
				break;
			case "2":
				candidato2++;
				break;
			case "3":
				candidato3++;
				break;
			case "fim":
				break;
			default:
			}

		} while (!voto.equalsIgnoreCase("fim"));

		System.out.println("Fim da votação");
		System.out.printf("Candidato 1: %d votos%n", candidato1);
		System.out.printf("Candidato 2: %d votos%n", candidato2);
		System.out.printf("Candidato 3: %d votos%n", candidato3);

	}

	public static void ex9() {

//Simule um caixa eletrônico que permite vários saques até o saldo acabar ou o usuário sair.

		int saldo = 3000, saque, opcao = 0;

		while (saldo > 0 && opcao != 2) {
			System.out.println("Digite 1 para fazer um saque");
			System.out.println("Digite 2 para sair");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o valor do saldo");
				saque = sc.nextInt();

				if (saque > 0 && saque <= saldo) {
					saldo -= saque;
					System.out.printf("Saldo: %d%n", saldo);
				} else {
					System.out.println("Saque inválido ou saldo insuficiente");
				}
				break;

			case 2:
				System.out.printf("Saindo do caixa%n");
				break;

			default:

				System.out.println("Opção inválida");
				break;
			}
		}
	}

	public static void ex10() {
//Faça uma pergunta (ex: "Qual a capital do Brasil?") até que o usuário acerte.

		int ano = 1910, palpite = 0, tentativa = 0;
		while (ano != palpite) {
			System.out.println("Em que ano o corinthians foi fundado");
			palpite = sc.nextInt();
			tentativa++;
			if (palpite != ano) {
				System.out.println("Ano errado! Tente novamente.");

			}
		}
		System.out.println("Correto! O ano era " + ano);
		System.out.println("Tentativas: " + tentativa);
	}

	public static void ex11() {
		// Peça CPF até que seja digitado com exatamente 11 dígitos.

		int contador = 0;
		String cpf;

		System.out.println("Digite o seu CPF");
		cpf = sc.next();

		for (int i = 0; i < cpf.length(); i++) {
			contador++;
		}
		if (contador != 11) {
			System.err.println("CPF inválido!");

		}
		System.out.printf("cpf %s tem %d contador", cpf, contador);

	}

	public static void ex12() {
//Faça 5 perguntas em sequência. Conte quantas foram respondidas corretamente.

		String pergunta;
		int certos = 0;

		for (int i = 1; i <= 5; i++) {

			switch (i) {
			case 1:
				System.out.println("Qual é a capital do Brasil");
				pergunta = sc.next();
				if (pergunta.equals("Brasilia")) {
					certos++;
					System.out.printf("Resposta certa %n%n");
				} else {
					System.out.printf("Resposta errada  %n%n");
				}
				break;

			case 2:
				System.out.println("Quanto é 10 x 5");
				pergunta = sc.next();
				if (pergunta.equals("50")) {
					certos++;
					System.out.printf("Resposta certa %n%n");
				} else {
					System.out.printf("Resposta errada %n%n");
				}
				break;

			case 3:
				System.out.println("Quanto é uma duzia");
				pergunta = sc.next();
				if (pergunta.equals("12")) {
					certos++;
					System.out.printf("Resposta certa %n%n");
				} else {
					System.out.printf("Resposta errada %n%n");
				}
				break;

			case 4:
				System.out.println("Quando é o natal");
				pergunta = sc.next();
				if (pergunta.equals("25/12")) {
					certos++;
					System.out.printf("Resposta certa %n%n");
				} else {
					System.out.printf("Resposta errada %n%n");
				}
				break;

			case 5:
				System.out.println("Quanto é 12 + 1");
				pergunta = sc.next();
				if (pergunta.equals("13")) {
					certos++;
					System.out.printf("Resposta certa %n%n");
				} else {
					System.out.printf("Resposta errada %n%n");
				}
				break;
			}
		}
		System.out.printf("Você acertou %d de 5 perguntas!%n", certos);
	}

	public static void ex13() {
//Peça uma letra e um número n. Mostre n vezes essa letra em uma mesma linha.
		String letra = "";
		int numero;

		System.out.println("Digite uma letra");
		letra = sc.next();

		System.out.println("Digite um número");
		numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {

			System.out.printf("%s", letra);
		}
	}

	public static void ex14() {
//Simule o lançamento de um dado 10 vezes, mostrando os resultados 
//(use um gerador de números aleatórios).

		int dados;
		System.out.println("Lançamento:");

		for (int i = 1; i <= 10; i++) {
			dados = rand.nextInt(1, 7);
			System.out.printf("Lançamento %d: %d%n", i, dados);
		}

	}

	public static void ex15() {
//Mostre um menu com 3 opções. Repita até o usuário escolher "Sair".

		String menu;

		do {
			System.out.println("menu");
			System.out.println("1 Ver mensagem");
			System.out.println("2 Abrir");
			System.out.println("3 Sair");

			System.out.println("Escolha uma opção");
			menu = sc.next();

			if (menu.equals("1")) {
				System.out.printf("Ver mensagem %n%n");

			} else if (menu.equals("2")) {
				System.out.printf("Abrir %n%n");

			} else if (menu.equals("3")) {
				System.out.printf("Sair %n%n");

			} else {

				System.out.printf("Opção inválida %n%n");

			}

		} while (!menu.equals("3") && !menu.equalsIgnoreCase("sair"));

	}

	public static void ex16() {
//Peça letras uma a uma até que o usuário digite a letra "x". 
//Conte quantas vezes digitou vogais.

		int vogais = 0;
		String letra;
		do {
			System.out.println("Informe um letra");
			letra = sc.next();
			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

				vogais++;
			}
		} while (!letra.equalsIgnoreCase("x"));
		System.out.printf("Quantidade de vogais: %d%n", vogais);
	}

	public static void ex17() {
//Permita o cadastro de nome e preço de produtos até que "fim" seja digitado. 
//Calcule o total geral.

		double preco, total = 0;
		String nome;

		do {
			System.out.println("Digite o nome do produto");
			nome = sc.next();

			if (!nome.equalsIgnoreCase("fim")) {
				System.out.printf("Digite o preço do produto %n");
				preco = sc.nextDouble();

				total += preco;
			}

		} while (!nome.equalsIgnoreCase("fim"));

		System.out.printf("Total: %.2f%n", total);

	}

	public static void ex18() {
//Peça uma frase e conte quantas palavras tem (com base nos espaços).

		String frase;
		int palavra = 0;

		System.out.println("Digite uma frase");
		frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (letra == ' ') {
				palavra++;
			}
		}
		if (frase.length() > 0) {
			palavra++;
		}

		System.out.printf("Quantidade de palavras %d %n", palavra);

	}

	public static void ex19() {
//Repetir senha até ter maiúscula, número e mínimo de 8 caracteres. 
//Use repetição até uma senha válida ser digitada.

		int senha;
		String letra, maiuscula, texto;

		do {
			maiuscula = "nao";
			letra = "nao";

			System.out.printf("Digite uma senha ");
			texto = sc.next();

			for (int i = 0; i < texto.length(); i++) {
				char caractere = texto.charAt(i);

				if (caractere >= 'A' && caractere <= 'Z') {
					maiuscula = "sim";
				}

				if (caractere >= '0' && caractere <= '9') {
					letra = "sim";
				}
			}

			if (texto.length() >= 8 && maiuscula.equals("sim") && letra.equals("sim")) {
				System.out.printf("Senha válida!%n");
			} else {
				System.out.printf("Senha inválida .%n%n");
			}

		} while (!(texto.length() >= 8 && maiuscula.equals("sim") && letra.equals("sim")));

	}

	public static void ex20() {
//Peça uma palavra e um caractere. Conte quantas vezes o caractere aparece.

		String palavra;
		int quantidade = 0;
		char caractere;

		System.out.println("Digite uma palavra");
		palavra = sc.next();

		System.out.printf("Digite um caractere");
		caractere = sc.next().charAt(0);
		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);

			if (letra == caractere) {
				quantidade++;

			}
		}
		System.out.printf("Total %d%n", quantidade);
	}

	public static void ex21() {
//Peça um número entre 1 e 100. Repita enquanto estiver fora do intervalo.

		int numero;
		do {
			System.out.println("Informe um número entre 1 a 100");
			numero = sc.nextInt();

			if (numero < 1 || numero > 100) {
				System.out.printf("Número inválido %d %n%n", numero);

			}

		} while (numero < 1 || numero > 100);
		System.out.println("número válido");
		System.out.printf("Número válido %d %n%n", numero);

	}

	public static void ex22() {
//Peça uma String e some os dígitos presentes (ex: "a2c4" → 6).

		String palavra;
		int soma = 0, numero = 0;
		System.out.println("Informe uma string");
		palavra = sc.next().toLowerCase();

		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);

			if (letra >= '0' && letra <= '9') {

				numero = letra - '0';
				soma += numero;
			}
		}
		System.out.printf("Soma: %d%n", soma);

	}

	public static void ex23() {
//Peça a digitação de um número inteiro até que seja digitado um valor negativo. 
//Ao digitar um valor negativo, deverão ser exibidos a média dos números digitados, 
//o menor número, o maior número, quantidade de números pares e quantidade de números ímpares.	

		int numero, soma = 0, qtd = 0, pares = 0, impares = 0, maior = 0, menor = 0;

		do {
			System.out.println("Digite um número");
			numero = sc.nextInt();

			if (numero >= 0) {
				soma += numero;
				qtd++;

				if (qtd == 1) {
					maior = numero;
					menor = numero;
				}

				if (numero > maior) {
					maior = numero;
				}

				if (numero < menor) {
					menor = numero;
				}

				switch (numero % 2) {
				case 0:
					pares++;
					break;
				case 1:
					impares++;
					break;
				}
			}

		} while (numero >= 0);

		if (qtd > 0) {
			System.out.printf("Média: %.2f%n", (double) soma / qtd);
			System.out.println("Maior número: " + maior);
			System.out.println("Menor número: " + menor);
			System.out.println("Pares: " + pares);
			System.out.println("Ímpares: " + impares);
		} else {
			System.out.println("Nenhum número foi digitado.");
		}
	}
}
