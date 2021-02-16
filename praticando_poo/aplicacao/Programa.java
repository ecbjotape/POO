package aplicacao;

import java.util.Scanner;

import entidades.retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		retangulo retangulo = new retangulo();
		System.out.println("Digite a Altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Digite a largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Area: "+retangulo.Area());
		System.out.println("Perimetro: "+retangulo.Perimetro());
		System.out.println("Diagonal: "+retangulo.Diagonal());
		
		
		sc.close();
		
	}

}
