package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("****************************");
		System.out.println("Digite os dados do produto: ");
		System.out.println("****************************");
		System.out.println("Nome: ");
		String nome = sc.next();
		nome = nome.toUpperCase();
		System.out.println("Preço: ");
		double preco = sc.nextInt();
		System.out.println("Quantidade no estoque: ");
		int quantidade = sc.nextInt();
		Product product = new Product(nome, preco, quantidade);

		System.out.println("Dados do produto: " + product.getNome() + ", R$ " + product.getPreco() + ", unidades "
				+ product.getQuantidade() + ", Total: R$ " + product.getPreco() * product.getQuantidade());

		System.out.println("Digite a quantidade de produtos que deseja adicionar no estoque: ");
		quantidade = sc.nextInt();
		product.addProduct(quantidade);
		System.out.println("Dados atualizados: " + product.getNome() + ", R$ " + product.getPreco() + ", " + product.getQuantidade()
				+ ", Total: " + product.totalValueInStock());
		System.out.println("Digite a quantidade que deseja remover do produto; ");
		quantidade = sc.nextInt();
		product.removeProduct(quantidade);
		System.out.println(product.toString());
		sc.close();
	}

}
