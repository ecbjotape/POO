package entidades04;

public class Banco {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	public Banco(int numeroConta, String nomeTitular, double saldoConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
	}
	
	public Banco(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Banco(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public double deposito(double valorDepositado){
		return this.saldoConta += valorDepositado;
	}
	
	public double saque(double valorSacado) {
		this.saldoConta -= 5;
		return this.saldoConta -= valorSacado;
		
	}
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	
	
}
