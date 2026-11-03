package trilhaJava;

import java.util.Scanner;

public class exerciciosDatrilha {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ex10();
	}

	public static void ex1() {
		// Prazer, Eu sou

		String nome = sc.nextLine();
		String semestre = sc.nextLine();
		String curso = sc.nextLine();
		String hobby = sc.nextLine();

		System.out.println("Prazer, Eu sou a (o) " + nome);
		System.out.println("Atualmente estou no " + semestre + "° semestre de " + curso);
		System.out.println("E meu hobby favorito é " + hobby);

	}

	public static void ex2() {
//Churrasco de Domingo 

		double quantidade = sc.nextDouble();
		double carne = 3.6, linguiça = 2.4, frango = 1.8;
		double custoTotal, carne1 = 180, linguiça1 = 67.20, frango1 = 39.60;
		double custoChurrasco = 286.80;
		double cadaPessoa = 23.90;

		System.out.printf("Quantidades: %nCarne: %.1f kg ", carne);
		System.out.printf("- Linguiça: %.1f kg ", linguiça);
		System.out.printf("- Frango: %.1f kg ", frango);

		System.out.printf("%n%nCusto total: %nR$ Carne: %.2f ", carne1);
		System.out.printf("- R$ Linguiça: %.2f ", linguiça1);
		System.out.printf("- R$ Frango: %.2f ", frango1);

		System.out.printf("%n%nCusto total do churrasco: R$ %.2f ", custoChurrasco);
		System.out.printf("%nCada pessoa deve contribuir com: R$ %.2f", cadaPessoa);

	}

	public static void ex3() {
		// média de notas

		String estudante = sc.nextLine();

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("O (A) estudante %s ficou com média %.1f%n", estudante, media);
	}

	public static void ex4() {
		// Compra no Exterior

		double dolares = 5.42;

		double real = sc.nextDouble();
		double dolar = real / dolares;

		System.out.printf("Valor em real R$ %.0f.%n", real);
		System.out.printf("Valor em dólar $ %.2f.%n", dolar);

	}

	public static void ex5() {
		// Compra online

		String nome = sc.nextLine();
		double numero = sc.nextDouble(); // 1000
		double desconto = sc.nextDouble(); // 10
		double valorFinal;

		valorFinal = numero * desconto / 100;
		valorFinal = numero - 100;

		System.out.printf("Olá %s, sua compra de R$ %.2f foi confirmada!%n", nome, numero);
		System.out.printf("Foi aplicado um desconto de %.1f%%%n", desconto);
		System.out.printf("O total final ficou em R$ %.2f%n", valorFinal);
	}

	public static void ex6() {
		// Cuidando da Saúde

		String nome = sc.nextLine();
		double peso = sc.nextDouble();
		double altura = sc.nextDouble();
		double imc;

		imc = peso / (altura * altura);

		System.out.printf("%s, seu IMC é de %.4f ", nome, imc);
	}

public static void ex7() {
	 //Você lê rápido
	
	String nome = sc.nextLine();
	String livro = sc.nextLine();
	int pagina = sc.nextInt();
	int tempo = sc.nextInt();
	
	double horas = (pagina * tempo) / 3600.0;
	
	System.out.printf("%s, você finalizará a leitura do livro %s em aproximadamente %.2f horas.%n", nome, livro, horas);
}

	public static void ex8() {
		// Açaiteria
		
		int qtdP = sc.nextInt();
		int qtdM = sc.nextInt();
		int qtdG = sc.nextInt();
		double cupom = sc.nextDouble(); // 50
		double total;
		double valor;
		
		
		double precoP = 13.50;
		double precoM = 15.00;
		double precoG = 17.50;
		
		total = (qtdP * precoP) + (qtdM * precoM) + (qtdG * precoG);
		cupom = total * (cupom / 100.0);
		valor = total - cupom;
		
		System.out.printf("Seu pedido foi registrado. %n - Açaí P: %d%n - Açaí M: %d%n - Açaí G: %d%n %nDesconto de 50%% aplicado. %nTotal R$ %.2f ",qtdP, qtdM, qtdG, cupom, valor);

	}

	public static void ex9() {
		// Piloto Kart
		
		double pista = sc.nextDouble();
		int voltas = sc.nextInt();
		double tempoVolta = sc.nextDouble();
		
		double distanciaKm = (pista * voltas) / 1000.0;
		double tempoMinutos = (voltas * tempoVolta) / 60.0;
		
		
		System.out.printf("Ánalise Preditiva Concluída %n-- %nDistância total a ser  percorrida: %.2f km. %nPrevisão de conclusão: %.1f minutos.", distanciaKm, tempoMinutos);	
	}

	public static void ex10() {
		// Meta Pessoal
		
		String meta = sc.nextLine();
		double valorMeta = sc.nextDouble();
		double salario = sc.nextDouble();
		double despesas = sc.nextDouble();
		
		double saldo = salario - despesas;
		double reserva = saldo * 0.30;
		double valorDisponivel = saldo - reserva;
		double prazo = valorMeta / valorDisponivel;
		
	System.out.printf("Meta: %s (R$ %.2f) %nSalário: R$ %.2f - Despesas: R$ %.2f%n", meta, valorMeta, salario, despesas);	
	System.out.printf("%nSaldo após despesas: R$ %.2f %nReserva fixa (30%%): R$ %.2f %nValor disponível para a meta: R$ %.2f por mês %nPrazo estimado para atingir a meta: %.2f meses",saldo,reserva, valorDisponivel,prazo);
		
		
		
		
		
		
	}
}