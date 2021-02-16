package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;




public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("****************************");
		System.out.println("Digite os dados do produto: ");
		System.out.println("****************************");
		System.out.println("Nome: ");
		product.nome = sc.next();
		product.nome = product.nome.toUpperCase();
		System.out.println("Preço: ");
		product.preco = sc.nextInt();
		System.out.println("Quantidade no estoque: ");
		product.quantidade = sc.nextInt();
		System.out.println("Dados do produto: "+ product.nome + ", R$ " + product.preco + ", unidades "+product.quantidade + ", Total: R$ " + product.preco * product.quantidade);
		
		System.out.println("Digite a quantidade de produtos que deseja adicionar no estoque: ");
		int quantidade = sc.nextInt();
		product.addProduct(quantidade);
		System.out.println("Dados atualizados: "+ product.nome + ", R$ " + product.preco + ", " + product.quantidade +", Total: "+ product.totalValueInStock());
		System.out.println("Digite a quantidade que deseja remover do produto; ");
		quantidade = sc.nextInt();
		product.removeProduct(quantidade);
		System.out.println(product.toString());
		sc.close();
	}

}
