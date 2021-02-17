package entities;

public class Product {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double totalValueInStock() {
		return preco * quantidade;
	}

	public void addProduct(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduct(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ "
				+ String.format("%.2f", totalValueInStock());
	}
}
