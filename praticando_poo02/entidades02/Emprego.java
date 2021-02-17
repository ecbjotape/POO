package entidades02;

public class Emprego {
	public String nome;
	public double salarioBruto;
	public double imposto;
	//public double porcentagem;
	
	
	public double SalarioLiquido() {
		
		return salarioBruto - imposto;
	}
	
	public void AumentarSalario(double porcentagem) {
		 porcentagem = porcentagem / 100;
		 double salarioLiquido = salarioBruto - imposto;
		 salarioBruto = salarioLiquido + (porcentagem * salarioBruto);
	}
}
