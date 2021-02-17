package aplicacao02;

import java.util.Scanner;

import entidades02.Emprego;

public class Programa02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Emprego emprego = new Emprego();
		System.out.println("Digite o seu nome; ");
		emprego.nome = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		emprego.salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		emprego.imposto = sc.nextDouble();
		System.out.println("Empregado; " + emprego.nome + ", R$ " + emprego.SalarioLiquido());
		System.out.println("Adicione uma porcentagem ao salario: ");
		double porcentagem = sc.nextDouble();
		emprego.AumentarSalario(porcentagem);
		System.out.println("Empregado; " + emprego.nome + ", R$ " + emprego.salarioBruto);

		sc.close();

	}

}
