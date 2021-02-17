package aplicacao03;

import java.util.Scanner;
import entidades03.AlunoNota;

public class Program03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AlunoNota AlunoNota = new AlunoNota();
		System.out.println("Digite o seu nome: ");
		AlunoNota.nome = sc.nextLine();
		System.out.println("Nota 1:");
		AlunoNota.nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		AlunoNota.nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		AlunoNota.nota3 = sc.nextDouble();

		AlunoNota.calculoNota();

		sc.close();
	}

}
