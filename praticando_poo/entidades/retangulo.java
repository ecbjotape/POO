package entidades;

public class retangulo {
	public double altura;
	public double largura;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return largura * 2 + altura * 2;
	}
	public double Diagonal() {
	double raiz = largura * largura + altura * altura;
	return Math.sqrt(raiz);
	}
}
