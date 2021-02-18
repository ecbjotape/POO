package aplicacao04;

import java.util.Scanner;

import entidades04.Banco;

public class Program04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao banco!");
		System.out.println("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		String nomeTitular = sc.next();
		System.out.println("Digite um valor inicial a ser depositado (OPCIONAL); ");
		double saldoConta = sc.nextDouble();
		Banco banco = new Banco(numeroConta, nomeTitular, saldoConta);
		System.out.println("Nome; " + banco.getNomeTitular() + " \nNumero da conta: " + banco.getNumeroConta()
				+ " \nSaldo Atual: " + banco.getSaldoConta());
		System.out.println("1. Depositar");
		System.out.println("2. Saque");
		System.out.println("9. SAIR");
		int opcao = sc.nextInt();
		while (opcao != 9) {

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor que deseja depositar: ");
				double valorDepositado = sc.nextDouble();
				System.out.println("Deposito realizado com sucesso!");
				System.out.println("Seu saldo atual é de; " + banco.deposito(valorDepositado));
				System.out.println("1. Depositar");
				System.out.println("2. Saque");
				System.out.println("9. SAIR");
				opcao = sc.nextInt();
				break;
			case 2:
				System.out.println("Digite o valor que deseja sacar: ");
				double valorSacado = sc.nextDouble();
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Seu saldo atual é de; " + banco.saque(valorSacado));
				System.out.println("1. Depositar");
				System.out.println("2. Saque");
				System.out.println("9. SAIR");
				opcao = sc.nextInt();
				break;
			default:
				System.out.println("Codigo invalido!");
				System.out.println("1. Depositar");
				System.out.println("2. Saque");
				System.out.println("9. SAIR");
				opcao = sc.nextInt();
			}

		}
		System.out.println("Saindo...");
		sc.close();
	}

}
