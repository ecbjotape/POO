package entidades03;

public class AlunoNota {

	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;

	public double calculoNota() {

		double notaFinal = nota1 + nota2 + nota3;
		if (notaFinal < 60) {

			System.out.println(nome);
			System.out.println("NOTA FINAL: " + notaFinal);
			System.out.println("REPROVADO");
			notaFinal = 60 - notaFinal;
			System.out.println("Ponto(s) necessário(s) para aprovação: " + notaFinal);
		} else {

			System.out.println(nome);
			System.out.println("NOTA FINAL: " + notaFinal);
			System.out.println("APROVADO");

		}
		return 0;
	}

}
